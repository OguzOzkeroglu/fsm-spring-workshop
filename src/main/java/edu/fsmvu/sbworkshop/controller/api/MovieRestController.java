package edu.fsmvu.sbworkshop.controller.api;

import edu.fsmvu.sbworkshop.model.Movie;
import edu.fsmvu.sbworkshop.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Oguz Ozkeroglu
 * Created on 2020.02.29
 */

@RestController
@RequestMapping("/api/v1/movies")
@RequiredArgsConstructor
public class MovieRestController {

    private final MovieService movieService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Movie getMovieById(@PathVariable Long id) {
        return movieService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Movie saveMovie(@RequestBody Movie movie) {
        return movieService.save(movie);
    }
}
