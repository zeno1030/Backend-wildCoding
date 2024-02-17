package practice.board.article.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import practice.board.article.entity.Article;
import practice.board.article.entity.dto.ArticleCreate;
import practice.board.article.entity.dto.ArticleSearchDto;
import practice.board.article.repository.ArticleRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

	private final ArticleRepository articleRepository;

	@Override
	public List<Article> findArticle(ArticleSearchDto articleSearchDto) {
		return articleRepository.findAllByWriter(articleSearchDto.getWriter());
	}

	@Override
	public Article create(ArticleCreate articleCreate) {
		return articleRepository.save(Article.toEntity(articleCreate));
	}
}
