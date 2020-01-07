package com.telus.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/schedule")
public class TtvToolController {

	private List<Schedule> schedule = new ArrayList<>();

	@GetMapping
	public String home(Model model) {
		model.addAttribute("schedule", schedule); // For the List view
		model.addAttribute("scheduleForm", new Schedule()); // For the Form
		return "home";
	}

	@PostMapping
	public String createSchedule(@ModelAttribute Schedule sched) {
		if (schedule.stream().noneMatch(f -> f.getName().equalsIgnoreCase(sched.getName()))) {
			schedule.add(sched);
		}

		return "redirect:/schedule";
	}

}
