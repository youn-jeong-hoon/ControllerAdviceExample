package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TestController {
  @GetMapping("/test")
  public CommonResponse test(@Valid UserParam param) {
    return new CommonResponse();
  }
}
