package com.domhallan.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GradeController {

  List<Grade> studentGrades = new ArrayList<>();

  @GetMapping("/grades")
  public String getGrades(Model model) {
    studentGrades.add(new Grade("Harry", "Potions", "A"));
    studentGrades.add(new Grade("Hermione", "Transfiguration", "A"));
    studentGrades.add(new Grade("Ron", "Divination", "D"));
    Grade grade = new Grade("Harry", "Potions", "A");
    model.addAttribute("grades", studentGrades);
    return "grades";
  }
}
