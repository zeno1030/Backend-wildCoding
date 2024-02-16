package practice.board.article.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import practice.board.article.controller.response.ArticleResponse;
import practice.board.article.dto.ArticleSearchDto;
import practice.board.article.service.ArticleServiceImpl;

@RestController
@RequiredArgsConstructor
public class ArticleController {

	private final ArticleServiceImpl articleService;

	@GetMapping("/api/v1/article")
	public List<ArticleResponse> searchArticle(@ModelAttribute ArticleSearchDto articleSearchDto) {
		return ArticleResponse.toResponse(articleService.findArticle(articleSearchDto));
	}

	// @PostMapping("/api/v1/write")
	// public String writeArticle(@RequestBody ArticleCreateDto articleCreateDto) {
	// 	articleService.saveArticle(articleCreateDto);
	// 	return "ok";
	// }

}
