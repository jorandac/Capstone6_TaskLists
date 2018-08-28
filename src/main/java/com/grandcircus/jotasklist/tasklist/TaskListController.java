package com.grandcircus.jotasklist.tasklist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import TaskListDao.TaskDao;

@Controller
public class TaskListController {
	
	@Autowired
	TaskDao t;
	
	@RequestMapping("/")
	public ModelAndView index () {
		ModelAndView mav = new ModelAndView("index"); 
		return mav; 
	}
	
	@RequestMapping("/tasklist")
	public ModelAndView taskList() {
		return new ModelAndView("tasklist", "task", t.findAll());
	}

	
	@RequestMapping("/createatask")
	public ModelAndView taskform() {
		return new ModelAndView("taskform");
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(@RequestParam("idemail") String idemail,@RequestParam("description") String description, @RequestParam("duedate") String duedate, @RequestParam(name="complete", required=false) Boolean complete) {
		if (complete == null) {
			complete=false;
		}
		return new ModelAndView("tasklist", "task1", t.findAll());
}
}
