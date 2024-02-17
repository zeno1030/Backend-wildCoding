package practice.board.article.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import practice.board.article.controller.response.ArticleResponse;
import practice.board.article.entity.Article;
import practice.board.article.entity.dto.ArticleCreate;
import practice.board.article.entity.dto.ArticleSearchDto;
import practice.board.article.service.ArticleServiceImpl;

@RestController
@RequiredArgsConstructor
public class ArticleController {

	private final ArticleServiceImpl articleService;

	@GetMapping("/api/v1/article")
	public List<ArticleResponse> searchArticle(@ModelAttribute ArticleSearchDto articleSearchDto) {
		List<Article> articles = articleService.findArticle(articleSearchDto);
		return articles.stream()
			.map(ArticleResponse::toResponse)
			.collect(Collectors.toList());
	}

	@PostMapping("/article")
	public ResponseEntity<ArticleResponse> create(@RequestBody @Valid ArticleCreate articleCreate) {
		return ResponseEntity.status(HttpStatus.CREATED)
			.body(ArticleResponse.toResponse(articleService.create(articleCreate)));
	}

}
