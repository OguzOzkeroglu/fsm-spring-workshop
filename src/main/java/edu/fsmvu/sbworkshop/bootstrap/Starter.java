package edu.fsmvu.sbworkshop.bootstrap;

import edu.fsmvu.sbworkshop.model.Movie;
import edu.fsmvu.sbworkshop.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Oguz Ozkeroglu
 * Created on 2020.02.29
 */

// @Component
@RequiredArgsConstructor
public class Starter implements CommandLineRunner {

    private final MovieService movieService;

    @Override
    public void run(String... args) throws Exception {
        Movie movie1 = Movie.builder().title("Avatar").year(2007).build();
        Movie movie2 = Movie.builder().title("Avatar 2").year(2008).build();
        Movie movie3 = Movie.builder().title("Avatar 3").year(2009).build();

        movieService.save(movie1);
        movieService.save(movie2);
        movieService.save(movie3);
    }
}
