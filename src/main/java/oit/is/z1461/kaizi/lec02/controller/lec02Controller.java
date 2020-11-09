package oit.is.z1461.kaizi.lec02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class lec02Controller {

  /**
   * @param username
   * @param model
   * @return
   */
  @PostMapping("/lec02")
  public String sample25(@RequestParam String username, ModelMap model) {
    model.addAttribute("name", username);
    return "lec02.html";
  }

}
