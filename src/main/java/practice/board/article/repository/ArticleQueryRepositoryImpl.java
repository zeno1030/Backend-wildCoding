package practice.board.article.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import practice.board.article.entity.Article;
import practice.board.article.entity.dto.ArticleCreate;
import practice.board.article.service.port.ArticleQueryRepository;

@Repository
@RequiredArgsConstructor
public class ArticleQueryRepositoryImpl implements ArticleQueryRepository {
	private final ArticleQueryJpaRepository articleQueryJpaRepository;

	@Override
	public List<Article> findAllByWriter(String writer) {
		return articleQueryJpaRepository.findAllByWriter(writer);
	}

	@Override
	public Article save(ArticleCreate articleCreate) {
		return articleQueryJpaRepository.save(Article.toEntity(articleCreate));
	}
}
