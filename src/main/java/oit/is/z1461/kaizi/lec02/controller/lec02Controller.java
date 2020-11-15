package oit.is.z1461.kaizi.lec02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

import oit.is.z1461.kaizi.lec02.model.Janken;

@Controller
@RequestMapping("/lec02")
public class Lec02Controller {

  /**
   * @return
   */
  @PostMapping()
  public String lec02(@RequestParam String username, ModelMap model) {
    model.addAttribute("name", username);
    return "lec02.html";
  }

  /**
   * @param hand
   * @param model
   * @return
   */
  @GetMapping("/janken")
  public String janken(@RequestParam String hand, ModelMap model) {
    Janken janken = new Janken(hand);
    model.addAttribute("janken", janken);
    return "lec02.html";
  }
}
