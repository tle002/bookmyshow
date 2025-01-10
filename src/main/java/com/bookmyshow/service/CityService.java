package com.bookmyshow.service;

import com.bookmyshow.model.City;
import com.bookmyshow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> listCities() {
        return cityRepository.findAll();
    }

    public City getCityById(Long cityId) {
        return cityRepository.findById(cityId).orElse(null);
    }

    public City addCity(City city) {
        return cityRepository.save(city);
    }

    public void deleteCity(Long cityId) {
        cityRepository.deleteById(cityId);
    }
}