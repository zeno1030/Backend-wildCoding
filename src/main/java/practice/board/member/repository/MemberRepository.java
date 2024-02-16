package practice.board.member.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import practice.board.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, String> {
	Optional<Member> findNameById(String id);
}
