package cz.wz.austra.connector;

import cz.wz.austra.City;
import cz.wz.austra.dto.WeatherApiDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.net.URI;
import java.net.URISyntaxException;

public class WeatherApiConnector {
    //https://api.weatherapi.com/v1/current.json?key=61f76c71e11549e3bdd100033231312&q=Ostrava&aqi=no
    //https://api.weatherapi.com/v1/current.json?key=61f76c71e11549e3bdd100033231312&q=Inari&aqi=no
  private static String baseUrl = "https://api.weatherapi.com/v1/";
  private static String urlParameters = "current.json?";
  private static String APIKey = "key=61f76c71e11549e3bdd100033231312";
  private static String url = baseUrl + urlParameters + APIKey + "&q=";
  //private static String url = "https://api.weatherapi.com/v1/current.json?key=61f76c71e11549e3bdd100033231312&q=Inari&aqi=no";
  public WeatherApiDto getWeatherForCity(City city)  {
    RestTemplate template = new RestTemplate();
    URI uri = null;
    try {
      uri = new URI(url + city.toString());
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
    ResponseEntity<WeatherApiDto> responseEntity = template.getForEntity(uri, WeatherApiDto.class);
    return responseEntity.getBody();
  }
}
