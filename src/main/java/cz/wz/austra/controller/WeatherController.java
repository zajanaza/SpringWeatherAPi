package cz.wz.austra.controller;

import cz.wz.austra.City;
import cz.wz.austra.connector.WeatherApiConnector;
import cz.wz.austra.dto.WeatherDto;
import cz.wz.austra.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class WeatherController {
@Autowired
  WeatherService service;
  @CrossOrigin
  @RequestMapping("/weather")
  Collection<WeatherDto> getWeather(){
    List<WeatherDto> weatherDtoList = new ArrayList<>();
    //WeatherService service = new WeatherService();
    for(City city:City.values()) {                       //zavola a naplni data opakovane pro kazde mesto v ENUMU City
      weatherDtoList.add(service.getWeatherForCity(city));
    }


    return weatherDtoList;
  }
  @CrossOrigin
  @RequestMapping("/weather/{city}")
  WeatherDto getWeatherForCity(@PathVariable("city") String city){
    City cityEnum = City.valueOf(city.toUpperCase());                //vratí instanci enumu nebo nulu
    //WeatherService weatherService = new WeatherService();
    return service.getWeatherForCity(cityEnum);
  }
}
