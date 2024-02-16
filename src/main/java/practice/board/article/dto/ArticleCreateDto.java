package practice.board.article.dto;



import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ArticleCreateDto {
	@NotBlank(message = "제목은 반드시 작성해주세요")
	private String title;
	@NotBlank(message = "내용은 작성해주세요")
	private String content;
	private String hashtag;
	private String writer;
	@Builder
	private ArticleCreateDto(
		String title,
		String content,
		String hashtag,
		String writer
	) {
		this.title = title;
		this.content = content;
		this.hashtag = hashtag;
		this.writer = writer;
	}
}
