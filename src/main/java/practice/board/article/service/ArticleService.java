package practice.board.article.service;

import java.util.List;

import org.springframework.stereotype.Service;

import practice.board.article.entity.Article;
import practice.board.article.entity.dto.ArticleCreate;
import practice.board.article.entity.dto.ArticleSearchDto;

@Service
public interface ArticleService {
	//작성자로 게시글 찾기
	List<Article> findArticle(ArticleSearchDto articleSearchDto);

	Article create(ArticleCreate articleCreate);
}
