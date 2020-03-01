package edu.fsmvu.sbworkshop.controller.web;

import edu.fsmvu.sbworkshop.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Oguz Ozkeroglu
 * Created on 2020.02.29
 */

@Controller
@RequestMapping("/web/v1/movies")
@RequiredArgsConstructor
public class MovieWebController {
    private final MovieService movieService;

    @RequestMapping({ "/", "" })
    public String getMovies(Model model) {
        model.addAttribute("movieList", movieService.getAllMovies());
        return "movies";
    }
}
