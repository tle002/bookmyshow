package com.bookmyshow.service;

import com.bookmyshow.model.Show;
import com.bookmyshow.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    public List<Show> listShowsByMovieId(Long movieId) {
        return showRepository.findByMovieId(movieId);
    }

    public Show createShow(Show show) {
        return showRepository.save(show);
    }

    public void deleteShow(Long showId) {
        showRepository.deleteById(showId);
    }

    public Show updateShow(Long showId, Show showDetails) {
        Show show = showRepository.findById(showId).orElseThrow(() -> new RuntimeException("Show not found"));
        show.setShowTime(showDetails.getShowTime());
        show.setAvailableSeats(showDetails.getAvailableSeats());
        return showRepository.save(show);
    }
}