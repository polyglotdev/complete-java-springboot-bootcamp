package com.domhallan.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
  public String gradeForm(Model model, @RequestParam String name,
                          @RequestParam String subject,
                          @RequestParam String grade) {
    model.addAttribute("grade", new Grade(name, subject, grade ));
    return "form";
  }

  @PostMapping("/submitForm")
  public String submitForm(Grade grade) {
    studentGrades.add(grade);
    return "redirect:/grades";
  }
}
