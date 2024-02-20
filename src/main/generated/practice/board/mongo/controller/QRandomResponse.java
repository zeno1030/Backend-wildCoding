package practice.board.mongo.controller;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * practice.board.mongo.controller.QRandomResponse is a Querydsl Projection type for RandomResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QRandomResponse extends ConstructorExpression<RandomResponse> {

    private static final long serialVersionUID = 1491433697L;

    public QRandomResponse(com.querydsl.core.types.Expression<org.bson.types.ObjectId> id, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<Long> value) {
        super(RandomResponse.class, new Class<?>[]{org.bson.types.ObjectId.class, String.class, long.class}, id, name, value);
    }

}

