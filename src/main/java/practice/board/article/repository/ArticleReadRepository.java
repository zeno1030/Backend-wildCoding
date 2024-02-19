package practice.board.article.repository;

import java.time.LocalDate;
import java.util.List;

import practice.board.article.controller.response.ArticleResponse;

public interface ArticleReadRepository {
	List<ArticleResponse> getArticle(LocalDate createdAt);
}
