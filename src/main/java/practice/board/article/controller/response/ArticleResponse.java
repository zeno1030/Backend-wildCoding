package practice.board.article.controller.response;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

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

	public static List<ArticleResponse> toResponse(List<Article> articles) {
		return articles.stream().map(article ->
			ArticleResponse.builder()
				.id(article.getId())
				.writer(article.getWriter())
				.title(article.getTitle())
				.content(article.getContent())
				.hashtag(article.getHashtag())
				.createdAt(article.getCreatedAt())
				.build()
		).collect(Collectors.toList());
	}
}
