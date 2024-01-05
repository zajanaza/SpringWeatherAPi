package cz.wz.austra.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
  @RequestMapping("/hello")
  String hello(){
    return "Ahoj";
  }
  @RequestMapping("/greeting")
  String greeting(){
    return "Greetings";
  }
}
