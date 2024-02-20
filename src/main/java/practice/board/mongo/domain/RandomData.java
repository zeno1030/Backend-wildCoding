package practice.board.mongo.domain;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Document(collection = "query")
public class RandomData {
	@Id
	private ObjectId id;
	private String name;
	private Long value;

	public RandomData(ObjectId id, String name, Long value) {
		this.id = id;
		this.name = name;
		this.value = value;
	}
}
