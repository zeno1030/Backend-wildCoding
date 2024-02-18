package practice.board.article.repository;

import static practice.board.article.entity.QArticle.*;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import practice.board.article.entity.Article;
import practice.board.article.entity.QArticle;

@Repository
public class ArticleQueryRepository {
	private final EntityManager em;
	private final JPAQueryFactory jpaQueryFactory;

	public ArticleQueryRepository(EntityManager em) {
		this.em = em;
		this.jpaQueryFactory = new JPAQueryFactory(em);
	}
	public List<Article> getDiary(LocalDateTime createdAt) {
		return jpaQueryFactory.select(
				article.id,
				article.content,
				article.hashtag,
				article.writer,
				article.title,
				article.createdAt)
			.from(article)
			.where()
	}
}
