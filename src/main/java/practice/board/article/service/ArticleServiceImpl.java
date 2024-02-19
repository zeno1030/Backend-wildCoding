package practice.board.article.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import practice.board.article.controller.response.ArticleResponse;
import practice.board.article.entity.Article;
import practice.board.article.entity.dto.ArticleCreate;
import practice.board.article.entity.dto.ArticleSearchDto;
import practice.board.article.repository.ArticleQueryRepository;
import practice.board.article.repository.ArticleRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

	private final ArticleRepository articleRepository;
	private final ArticleQueryRepository queryRepository;

	@Override
	public List<Article> findArticle(ArticleSearchDto articleSearchDto) {
		return articleRepository.findAllByWriter(articleSearchDto.getWriter());
	}

	@Override
	public List<ArticleResponse> getArticle(LocalDate createdAt) {
		return queryRepository.getArticle(createdAt);
	}

	@Override
	public Article create(ArticleCreate articleCreate) {
		return articleRepository.save(Article.toEntity(articleCreate));
	}
}
