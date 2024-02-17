package practice.board.article.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import practice.board.article.entity.dto.ArticleCreate;
import practice.board.base.BaseEntity;
import practice.board.member.entity.Member;

@Entity
@Table(name = "article")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "content", nullable = false, length = 65535)
	private String content;

	@Column(name = "hashtag")
	private String hashtag;

	@Column(name = "writer", nullable = false, length = 100)
	private String writer;

	@Column(name = "deleted_at")
	private LocalDateTime deletedAt;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id", referencedColumnName = "id", nullable = false)
	private Member memberId;

	public Article(String title, String content, String hashtag, String writer) {
		this.title = title;
		this.content = content;
		this.hashtag = hashtag;
		this.writer = writer;
	}

	public static Article toEntity(ArticleCreate articleCreate) {
		return new Article(
			articleCreate.getTitle(),
			articleCreate.getContent(),
			articleCreate.getHashtag(),
			articleCreate.getWriter());
	}
}

