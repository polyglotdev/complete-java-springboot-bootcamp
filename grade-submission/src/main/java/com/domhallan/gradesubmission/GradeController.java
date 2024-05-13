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
    model.addAttribute("grades", studentGrades);
    return "grades";
  }

  @GetMapping("/")
  public String gradeForm(Model model) {
    model.addAttribute("grade", new Grade());
    return "form";
  }

  @PostMapping("/submitForm")
  public String submitForm(Grade grade) {
    studentGrades.add(grade);
    return "redirect:/grades";
  }
}
