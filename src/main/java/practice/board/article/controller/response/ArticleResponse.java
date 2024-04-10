package practice.board.article.controller.response;

import java.time.LocalDateTime;

import com.querydsl.core.annotations.QueryProjection;

import lombok.Builder;
import lombok.Getter;
import practice.board.article.entity.Article;

@Getter
@Builder // 빌더의 사용이유를 알 필요가 있어보임
public class ArticleResponse {

	private Long id;
	private String title;
	private String content;
	private String hashtag;
	private String writer;
	private LocalDateTime createdAt;
	private Long count;
	private String name;

	public static ArticleResponse toResponse(Article article) {
		return ArticleResponse.builder()
			.id(article.getId())
			.title(article.getTitle())
			.content(article.getContent())
			.hashtag(article.getHashtag())
			.writer(article.getWriter())
			.createdAt(article.getCreatedAt()).build();
	}

	@QueryProjection
	public ArticleResponse(Long id, String title, String content, String hashtag, String writer,
		LocalDateTime createdAt, Long count, String name) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.hashtag = hashtag;
		this.writer = writer;
		this.createdAt = createdAt;
		this.count = count;
		this.name = name;
	}
}
