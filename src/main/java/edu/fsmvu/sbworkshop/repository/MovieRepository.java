package edu.fsmvu.sbworkshop.repository;

import edu.fsmvu.sbworkshop.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Oguz Ozkeroglu
 * Created on 2020.02.29
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> getAllByDirector(String director);
}
