package practice.board.article.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import practice.board.article.controller.response.ArticleResponse;
import practice.board.article.entity.Article;
import practice.board.article.entity.dto.ArticleCreate;
import practice.board.article.entity.dto.ArticleSearch;
import practice.board.article.repository.ArticleQueryJpaRepository;
import practice.board.article.service.port.ArticleReadRepository;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

	private final ArticleQueryJpaRepository articleQueryJpaRepository;
	private final ArticleReadRepository articleReadRepository;

	@Override
	public List<Article> findArticle(ArticleSearch articleSearch) {
		return articleQueryJpaRepository.findAllByWriter(articleSearch.getWriter());
	}

	@Override
	public List<ArticleResponse> getArticle(LocalDate createdAt) {
		return articleReadRepository.getArticle(createdAt);
	}

	@Override
	@Transactional
	public Article create(ArticleCreate articleCreate) {
		return articleQueryJpaRepository.save(Article.toEntity(articleCreate));
	}
}
