package spring_exam.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import spring_exam.demo.entity.Comment;

import java.util.ArrayList;

public interface CommentRepository extends JpaRepository<Comment,Long> {
    @Override
    ArrayList<Comment> findAll();

    @Query(value = "SELECT * FROM comment WHERE boardid=:boardid",nativeQuery = true)
    ArrayList<Comment> findByBoardid(@Param("boardid") Long boardid);

    ArrayList<Comment> findByName(@Param("name") String name);
}
