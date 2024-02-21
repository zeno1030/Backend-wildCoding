package practice.board.article.service.port;

import java.util.List;

import practice.board.article.entity.Article;
import practice.board.article.entity.dto.ArticleCreate;

public interface ArticleQueryRepository {
	List<Article> findAllByWriter(String writer);

	Article save(ArticleCreate articleCreate);
}
