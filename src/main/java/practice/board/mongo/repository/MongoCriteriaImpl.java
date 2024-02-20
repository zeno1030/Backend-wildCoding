package practice.board.mongo.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import practice.board.mongo.controller.RandomResponse;
import practice.board.mongo.domain.RandomData;

@Repository
@RequiredArgsConstructor
public class MongoCriteriaImpl implements MongoCriteria {

	private final MongoTemplate mongoTemplate;

	@Override
	public List<RandomResponse> getByCriteria(Long value) {
		Query query = new Query();
		query.addCriteria(Criteria.where("value").gte(value));
		return mongoTemplate.find(query, RandomData.class).stream().map(RandomResponse::toResponse).collect(
			Collectors.toList());
	}
}
