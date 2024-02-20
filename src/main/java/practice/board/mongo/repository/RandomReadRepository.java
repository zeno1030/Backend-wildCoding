package practice.board.mongo.repository;

import java.util.List;

import practice.board.mongo.controller.RandomResponse;

public interface RandomReadRepository {
	List<RandomResponse> getByQueryDsl(Long value);
}
