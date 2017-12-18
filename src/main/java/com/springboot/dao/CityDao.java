package com.springboot.dao;

import com.springboot.model.City;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CityDao {
    @Select("SELECT * FROM city")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "provinceId", column = "province_id"),
            @Result(property = "cityName", column = "city_name"),
            @Result(property = "description", column = "description"),
    })
    City findByName(@Param("cityName") String cityName);

}
