package cz.wz.austra.controller;

import cz.wz.austra.connector.WeatherApiConnector;
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
  String getWeatherForCity(@PathVariable("city") String city){
    WeatherApiConnector connector = new WeatherApiConnector();
    return connector.getWeatherForCity(city);

  }
}
