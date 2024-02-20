package practice.board.mongo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import practice.board.mongo.controller.RandomResponse;
import practice.board.mongo.repository.RandomReadRepository;

@Service
@RequiredArgsConstructor
public class MongoService {
	private final RandomReadRepository repository;

	public List<RandomResponse> getMongo(Long value) {
		return repository.getByQueryDsl(value);
	}

}
