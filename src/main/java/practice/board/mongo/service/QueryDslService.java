package practice.board.mongo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import practice.board.mongo.controller.RandomResponse;
import practice.board.mongo.repository.MongoQueryDsl;

@Service
@RequiredArgsConstructor
public class QueryDslService {
	private final MongoQueryDsl repository;

	public List<RandomResponse> getByQueryDsl(Long value) {
		return repository.getByQueryDsl(value);
	}

}
