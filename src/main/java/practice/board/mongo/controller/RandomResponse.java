package practice.board.mongo.controller;

import org.bson.types.ObjectId;

import com.querydsl.core.annotations.QueryProjection;

import lombok.Builder;
import lombok.Getter;
import practice.board.mongo.domain.RandomData;

@Getter
@Builder
public class RandomResponse {
	private ObjectId id;
	private String name;
	private Long value;

	public static RandomResponse toResponse(RandomData randomData) {
		return RandomResponse.builder()
			.id(randomData.getId())
			.name(randomData.getName())
			.value(randomData.getValue())
			.build();
	}

	@QueryProjection
	public RandomResponse(ObjectId id, String name, Long value) {
		this.id = id;
		this.name = name;
		this.value = value;
	}
}
