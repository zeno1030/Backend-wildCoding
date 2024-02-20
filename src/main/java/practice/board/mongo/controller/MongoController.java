package practice.board.mongo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import practice.board.mongo.service.CriteriaService;
import practice.board.mongo.service.QueryDslService;

@RestController
@RequiredArgsConstructor
public class MongoController {
	private final QueryDslService queryDslService;
	private final CriteriaService criteriaService;

	@GetMapping("/mongo/query")
	public List<RandomResponse> getMongo(@RequestParam(name = "value") Long value) {
		return queryDslService.getByQueryDsl(value);
	}

	@GetMapping("/mongo/criteria")
	public List<RandomResponse> getCriteria(@RequestParam(name = "value") Long value) {
		return criteriaService.getByCriteria(value);
	}

}
