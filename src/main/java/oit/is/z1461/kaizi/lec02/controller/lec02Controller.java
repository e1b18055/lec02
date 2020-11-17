package oit.is.z1461.kaizi.lec02.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

import oit.is.z1461.kaizi.lec02.model.Janken;
import oit.is.z1461.kaizi.lec02.model.Entry;

@Controller
public class Lec02Controller {

  @Autowired
  private Entry entry;

  /**
   * @param model
   * @param prin
   * @return
   */
  @GetMapping("/lec02")
  public String lec02(ModelMap model, Principal prin) {
    String username = prin.getName();
    this.entry.addUser(username);
    model.addAttribute("name", username);
    model.addAttribute("entry", this.entry);
    return "lec02.html";
  }

  /**
   * @param hand
   * @param model
   * @return
   */
  @GetMapping("/lec02/janken")
  public String janken(@RequestParam String hand, ModelMap model) {
    Janken janken = new Janken(hand);
    model.addAttribute("entry", entry);
    model.addAttribute("janken", janken);
    return "lec02.html";
  }
}
