package cz.wz.austra.dto;

public class WeatherDto {
  private String location;
  private String timestamp;
  private double temp_celsius;
  private double windSpeed_mps;
  private int rel_humidity;
  private String wind_direction;
  private String weather_description;
  private double feelslike_c;
  private String weather_icon;
  public String getWeather_icon() { return weather_icon; }
  public void setWeather_icon(String weather_icon) { this.weather_icon = weather_icon; }
  public double getFeelslike_c() { return feelslike_c; }
  public void setFeelslike_c(double feelslike_c) { this.feelslike_c = feelslike_c; }
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public double getTemp_celsius() {
    return temp_celsius;
  }

  public void setTemp_celsius(double temp_celsius) {
    this.temp_celsius = temp_celsius;
  }

  public double getWindSpeed_mps() {
    return windSpeed_mps;
  }

  public void setWindSpeed_mps(double windSpeed_mps) {
    this.windSpeed_mps = windSpeed_mps;
  }

  public int getRel_humidity() {
    return rel_humidity;
  }

  public void setRel_humidity(int rel_humidity) {
    this.rel_humidity = rel_humidity;
  }

  public String getWind_direction() {
    return wind_direction;
  }

  public void setWind_direction(String wind_direction) {
    this.wind_direction = wind_direction;
  }

  public String getWeather_description() {
    return weather_description;
  }

  public void setWeather_description(String weather_description) {
    this.weather_description = weather_description;
  }


}
