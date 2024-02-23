package practice.board.article.controller.response;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ArticleCreateResponse {
	private Long id;
	private String title;
	private String content;
	private String hashtag;
	private String writer;
	private LocalDateTime createdAt;
	private Long count;
	private String name;
}
