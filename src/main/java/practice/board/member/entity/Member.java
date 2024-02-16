package practice.board.member.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import practice.board.base.BaseEntity;

@Entity
@Getter
@Setter
@Table(name = "member")
public class Member extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "count", nullable = false)
	private Long count;

	private LocalDateTime deletedAt;

}
