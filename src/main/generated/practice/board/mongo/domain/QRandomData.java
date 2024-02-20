package practice.board.mongo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRandomData is a Querydsl query type for RandomData
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRandomData extends EntityPathBase<RandomData> {

    private static final long serialVersionUID = -1076107358L;

    public static final QRandomData randomData = new QRandomData("randomData");

    public final ComparablePath<org.bson.types.ObjectId> id = createComparable("id", org.bson.types.ObjectId.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> value = createNumber("value", Long.class);

    public QRandomData(String variable) {
        super(RandomData.class, forVariable(variable));
    }

    public QRandomData(Path<? extends RandomData> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRandomData(PathMetadata metadata) {
        super(RandomData.class, metadata);
    }

}

