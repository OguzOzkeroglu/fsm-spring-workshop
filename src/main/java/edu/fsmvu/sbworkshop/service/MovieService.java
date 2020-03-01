package edu.fsmvu.sbworkshop.service;

import edu.fsmvu.sbworkshop.exception.ResourceNotFoundException;
import edu.fsmvu.sbworkshop.model.Movie;
import edu.fsmvu.sbworkshop.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Oguz Ozkeroglu
 * Created on 2020.02.29
 */

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie findById(Long id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }
}
