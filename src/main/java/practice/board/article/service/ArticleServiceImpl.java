package practice.board.article.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import practice.board.article.dto.ArticleSearchDto;
import practice.board.article.entity.Article;
import practice.board.article.repository.ArticleRepository;
import practice.board.member.repository.MemberRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

	private final ArticleRepository articleRepository;
	private final MemberRepository memberRepository;

	@Override
	public List<Article> findArticle(ArticleSearchDto articleSearchDto) {
		return articleRepository.findAllByWriter(articleSearchDto.getWriter());
	}

	// @Override
	// public Article saveArticle(ArticleCreateDto articleCreateDto) {
	// 	Member member = memberRepository.findNameById(String.valueOf(articleCreateDto.getMemberId()))
	// 		.orElseThrow(() -> new IllegalArgumentException("Invalid member ID: " + articleCreateDto.getMemberId()));
	// 	Article article = Article.createArticle();
	// 	article.setTitle(article.getTitle());
	// 	article.setContent(article.getContent());
	// 	article.setHashtag(article.getHashtag());
	// 	article.setWriter(article.getWriter());
	// 	article.getMemberId();
	// 	return articleRepository.save(article);
	// }
}
