package com.domhallan.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GradeController {

  List<Grade> studentGrades = new ArrayList<>();

  @GetMapping("/grades")
  public String getGrades(Model model) {
    Grade grade = new Grade("Harry", "Potions", "A");
    model.addAttribute("grades", studentGrades);
    return "grades";
  }

  @GetMapping("/")
  public String gradeForm(Model model) {
    model.addAttribute("grade", new Grade());

    return "form";
  }

  @PostMapping("/handleSubmit")
  public String handleSubmit(Grade grade) {
    studentGrades.add(grade);
    return "redirect:/grades";
  }
}
