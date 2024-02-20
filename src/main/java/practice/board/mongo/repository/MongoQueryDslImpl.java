package practice.board.mongo.repository;

import static practice.board.mongo.domain.QRandomData.*;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import practice.board.mongo.controller.RandomResponse;

@Repository
public class MongoQueryDslImpl extends QuerydslRepositorySupport implements MongoQueryDsl {

	public MongoQueryDslImpl(MongoOperations operations) {
		super(operations);
	}

	@Override
	public List<RandomResponse> getByQueryDsl(Long value) {
		return from(randomData)
			.where(randomData.value.goe(value))
			.fetch()
			.stream().map(RandomResponse::toResponse).collect(Collectors.toList());
	}
}
