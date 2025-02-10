package spring_exam.demo.repository;

import org.springframework.data.repository.CrudRepository;
import spring_exam.demo.entity.Board;

import java.util.ArrayList;

public interface BoardRepository extends CrudRepository<Board,Long> {
    @Override
    ArrayList<Board> findAll();


}
