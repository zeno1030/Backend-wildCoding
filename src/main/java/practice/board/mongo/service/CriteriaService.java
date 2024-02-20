package practice.board.mongo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import practice.board.mongo.controller.RandomResponse;
import practice.board.mongo.repository.MongoCriteria;

@Service
@RequiredArgsConstructor
public class CriteriaService {
	private final MongoCriteria mongoCriteria;

	public List<RandomResponse> getByCriteria(Long value) {
		return mongoCriteria.getByCriteria(value);
	}

}
