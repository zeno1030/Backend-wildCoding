package practice.board.article.controller.response;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import practice.board.article.entity.Article;

@Getter
@Builder
public class ArticleResponse {

	private Long id;
	private String title;
	private String content;
	private String hashtag;
	private String writer;
	private LocalDateTime createdAt;

	public static ArticleResponse toResponse(Article article) {
		return ArticleResponse.builder()
			.id(article.getId())
			.title(article.getTitle())
			.content(article.getContent())
			.hashtag(article.getHashtag())
			.writer(article.getWriter())
			.createdAt(article.getCreatedAt()).build();
	}
}
