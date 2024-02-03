package cz.wz.austra.service;

import cz.wz.austra.City;
import cz.wz.austra.connector.WeatherApiConnector;
import cz.wz.austra.dto.WeatherApiDto;
import cz.wz.austra.dto.WeatherDto;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
  public WeatherDto getWeatherForCity(City cityEnum){
    WeatherApiConnector connector = new WeatherApiConnector();
    WeatherApiDto connectorWeatherForCity = connector.getWeatherForCity(cityEnum);
    WeatherDto weatherDto = transformDto(connectorWeatherForCity);
    return weatherDto;
  }

  private static WeatherDto transformDto(WeatherApiDto weatherApiDto) {
    WeatherDto weatherDto = new WeatherDto();
    weatherDto.setLocation(weatherApiDto.getLocation().getName());
    weatherDto.setTimestamp(weatherApiDto.getCurrent().getLast_updated());
    weatherDto.setTemp_celsius(weatherApiDto.getCurrent().getTemp_c());
    weatherDto.setWindSpeed_mps(Math.round(weatherApiDto.getCurrent().getWind_kph()/3.6));
    //weatherDto.setWindSpeed_mps (weatherApiDto.getCurrent().getWind_kph()/3.6);    ;
    weatherDto.setRel_humidity(weatherApiDto.getCurrent().getHumidity());
    weatherDto.setWind_direction(weatherApiDto.getCurrent().getWind_dir());
    weatherDto.setWeather_description(weatherApiDto.getCurrent().getCondition().getText());
    return weatherDto;
  }
}
