package practice.board.article.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto {

	private Long id;
	private String title;
	private String content;
	private String hashtag;
	private String writer;
	private LocalDateTime createdAt;

}
