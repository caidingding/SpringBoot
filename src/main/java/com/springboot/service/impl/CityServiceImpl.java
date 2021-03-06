package com.springboot.service.impl;

import com.springboot.dao.CityDao;
import com.springboot.model.City;
import com.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityDao cityDao;


    @Override
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}
