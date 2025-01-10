package com.bookmyshow.service;

import com.bookmyshow.model.Theatre;
import com.bookmyshow.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {

    @Autowired
    private TheatreRepository theatreRepository;

    public List<Theatre> listTheatresByCityId(Long cityId) {
        return theatreRepository.findByCityId(cityId);
    }

    public Theatre addTheatre(Theatre theatre) {
        return theatreRepository.save(theatre);
    }

    public void deleteTheatre(Long theatreId) {
        theatreRepository.deleteById(theatreId);
    }
}