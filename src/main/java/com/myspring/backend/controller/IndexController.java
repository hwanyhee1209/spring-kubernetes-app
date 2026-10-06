package com.myspring.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class IndexController {
  @GetMapping("/")
  public Map<String, String> index(){
    Map<String, String> model = Map.of("message", "Hello Kubernetes CI/CD is Easy","version", "1.0");
    return model;
  }
}
