package practice.board.article.service;

import java.util.List;

import org.springframework.stereotype.Service;

import practice.board.article.dto.ArticleDto;
import practice.board.article.dto.ArticleSearchDto;
@Service
public interface ArticleService {
	//작성자로 게시글 찾기
	List<ArticleDto> findArticle(ArticleSearchDto searchDto);
}
