package cz.wz.austra.controller;

import cz.wz.austra.City;
import cz.wz.austra.connector.WeatherApiConnector;
import cz.wz.austra.dto.WeatherDto;
import cz.wz.austra.service.WeatherService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
  @RequestMapping("/weather")
  String getWeather(){
    return "Pocasi pro vsechna mesta";
  }
  @RequestMapping("/weather/{city}")
  WeatherDto getWeatherForCity(@PathVariable("city") String city){
    City cityEnum = City.valueOf(city.toUpperCase());                //vratí instanci enumu nebo nulu
    WeatherService weatherService = new WeatherService();
    return weatherService.getWeatherForCity(cityEnum);
  }
}
