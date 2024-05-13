package com.domhallan.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class GradeController {

  List<Grade> studentGrades = Arrays.asList(
    new Grade("Harry", "Potions", "A"),
    new Grade("Hermione", "Transfiguration", "A"),
    new Grade("Ron", "Divination", "D")
  );

  @GetMapping("/grades")
  public String getGrades(Model model) {
    Grade grade = new Grade("Harry", "Potions", "A");
    model.addAttribute("grades", studentGrades);
    return "grades";
  }

  @GetMapping("/")
  public String gradeForm(Model model) {
    model.addAttribute("grade", new Grade("Draco", "Defense Against the Dark Arts", "A"));

    return "form";
  }
}
