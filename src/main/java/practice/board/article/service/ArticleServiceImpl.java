package practice.board.article.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import practice.board.article.dto.ArticleDto;
import practice.board.article.dto.ArticleSearchDto;
import practice.board.article.repository.ArticleRepository;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
	private final ArticleRepository articleRepository;
	@Override
	public List<ArticleDto> findArticle(ArticleSearchDto searchDto) {
		return articleRepository.findAllByWriter(searchDto);
	}
}
