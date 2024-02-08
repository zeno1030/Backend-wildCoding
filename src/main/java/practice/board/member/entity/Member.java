package practice.board.member.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import practice.board.base.BaseEntity;

@Entity
@Getter
@Table(name = "member")
public class Member extends BaseEntity {

	@Id
	private String id;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "count", nullable = false)
	private Long count;

	private LocalDateTime deletedAt;

}
