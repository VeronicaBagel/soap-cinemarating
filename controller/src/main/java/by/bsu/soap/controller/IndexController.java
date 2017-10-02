package by.bsu.soap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


  @GetMapping (value = "/")
  public String index(Model model) {
    return "redirect:/cinemarating/main";
  }

  @GetMapping (value = "/main")
  public String home(Model model){
    return "main";
  }

}
