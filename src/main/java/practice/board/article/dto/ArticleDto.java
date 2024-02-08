package practice.board.article.dto;

import java.time.LocalDateTime;

import com.querydsl.core.annotations.QueryProjection;

import lombok.Data;


@Data
public class ArticleDto {

	private Long id;
	private String title;
	private String content;
	private String hashtag;
	private String writer;
	private LocalDateTime createdAt;

	public ArticleDto(Long id, String title, String content, String hashtag, String writer, LocalDateTime createdAt) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.hashtag = hashtag;
		this.writer = writer;
		this.createdAt = createdAt;
	}
}
