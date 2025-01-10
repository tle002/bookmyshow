package com.bookmyshow.controller;

import com.bookmyshow.model.Theatre;
import com.bookmyshow.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/theatres")
public class TheatreController {

    @Autowired
    private TheatreService theatreService;

    @GetMapping("/city/{cityId}")
    public List<Theatre> listTheatres(@PathVariable Long cityId) {
        return theatreService.listTheatresByCityId(cityId);
    }
}