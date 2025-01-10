package com.bookmyshow.controller;

import com.bookmyshow.model.Show;
import com.bookmyshow.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shows")
public class ShowController {

    @Autowired
    private ShowService showService;

    @GetMapping("/movie/{movieId}")
    public ResponseEntity<List<Show>> listShows(@PathVariable Long movieId) {
        List<Show> shows = showService.getShowsByMovieId(movieId);
        return ResponseEntity.ok(shows);
    }
}