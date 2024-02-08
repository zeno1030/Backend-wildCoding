package practice.board.article;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import practice.board.article.dto.ArticleDto;
import practice.board.article.dto.ArticleSearchDto;
import practice.board.article.service.ArticleServiceImpl;

@RestController
@RequiredArgsConstructor
public class ArticleController {

	private final ArticleServiceImpl articleService;

	@GetMapping("/api/v1/article")
	public List<ArticleDto> searchArticle(@ModelAttribute ArticleSearchDto articleSearchDto) {
		return articleService.findArticle(articleSearchDto);
	}
}
