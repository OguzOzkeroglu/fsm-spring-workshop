package edu.fsmvu.sbworkshop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Oguz Ozkeroglu
 * Created on 2020.02.29
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Integer year;
    private String genre;
    private String director;
    private String actors;
    private String plot;
    private Double imdbRating;
    private String imdbId;
    private String image;
}
