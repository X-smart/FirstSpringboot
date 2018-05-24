package cn.com.taiji.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
 @GetMapping("/")
 public String index() {
  return "My name is Xuconghui";
 }
}