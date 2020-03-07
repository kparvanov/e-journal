package com.ejournal.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class HomeController {

  @RequestMapping(value = "/")
  public String index() {
    return "index";
  }

}
