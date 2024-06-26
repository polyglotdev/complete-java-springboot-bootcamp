package com.domhallan.othergradebook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {

    @GetMapping("/grades")
    public String getGrades(Model model) {
        Grade grade = new Grade("Harry", "Potions", "A");
        model.addAttribute("grade", grade);
        return "grades";
    }
}
