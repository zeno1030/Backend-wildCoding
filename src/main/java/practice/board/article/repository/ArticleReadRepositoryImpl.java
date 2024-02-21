package practice.board.article.repository;

import static practice.board.article.entity.QArticle.*;
import static practice.board.member.entity.QMember.*;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import practice.board.article.controller.response.ArticleResponse;
import practice.board.article.controller.response.QArticleResponse;
import practice.board.article.service.port.ArticleReadRepository;

@Repository
public class ArticleReadRepositoryImpl implements ArticleReadRepository {
	private final JPAQueryFactory jpaQueryFactory;

	public ArticleReadRepositoryImpl(EntityManager em) {
		this.jpaQueryFactory = new JPAQueryFactory(em);
	}

	@Override
	public List<ArticleResponse> getArticle(LocalDate createdAt) {
		return jpaQueryFactory.select(
				new QArticleResponse(
					article.id,
					article.title,
					article.content,
					article.hashtag,
					article.writer,
					article.createdAt,
					member.count,
					member.name
				))
			.from(article)
			.leftJoin(article.memberId, member)
			.where(article.createdAt.goe(createdAt.atStartOfDay()),
				article.createdAt.lt(createdAt.atStartOfDay().plusDays(1)))
			.fetch();
	}

}
