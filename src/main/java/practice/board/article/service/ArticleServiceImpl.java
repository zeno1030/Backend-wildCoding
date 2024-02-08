package practice.board.article.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import practice.board.article.dto.ArticleDto;
import practice.board.article.dto.ArticleSearchDto;
import practice.board.article.entity.Article;
import practice.board.article.repository.ArticleRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

	private final ArticleRepository articleRepository;
	@Override
	public List<ArticleDto> findArticle(ArticleSearchDto articleSearchDto) {
		return articleRepository.findAllByWriter(articleSearchDto.getWriter())
			.stream()
			.map(Article::toDto) // 인스턴스 메소드 참조를 위해 람다 표현식 사용
			.collect(Collectors.toList());
	}
}
