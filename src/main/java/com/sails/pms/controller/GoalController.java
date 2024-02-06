package com.sails.pms.controller;

import com.sails.pms.model.Goal;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GoalController {

    @GetMapping("/add-goal")
    public String addGoalPage(Model model) {
        model.addAttribute("goal", new Goal());
        return "add-goal";
    }

    @PostMapping("/addgoal")
    public ResponseEntity<String> addGoal(@ModelAttribute("goal") Goal goal) {
        System.out.println(goal);
        return ResponseEntity.ok("Goal added successfully");
    }
}
