package practice.board.article.controller.response;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * practice.board.article.controller.response.QArticleResponse is a Querydsl Projection type for ArticleResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QArticleResponse extends ConstructorExpression<ArticleResponse> {

    private static final long serialVersionUID = 1366962089L;

    public QArticleResponse(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> content, com.querydsl.core.types.Expression<String> hashtag, com.querydsl.core.types.Expression<String> writer, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdAt, com.querydsl.core.types.Expression<Long> count, com.querydsl.core.types.Expression<String> name) {
        super(ArticleResponse.class, new Class<?>[]{long.class, String.class, String.class, String.class, String.class, java.time.LocalDateTime.class, long.class, String.class}, id, title, content, hashtag, writer, createdAt, count, name);
    }

}

