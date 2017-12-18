package com.springboot.service;

import com.springboot.model.City;

public interface CityService {
    /**
     *
     */
   City  findCityByName(String cityName);

}
