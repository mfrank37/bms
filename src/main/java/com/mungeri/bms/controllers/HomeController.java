package com.mungeri.bms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

  @GetMapping()
  public String getHomePage() {
    return new String("home_page");
  }
}
