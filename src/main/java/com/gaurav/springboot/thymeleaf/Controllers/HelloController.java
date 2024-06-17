package com.gaurav.springboot.thymeleaf.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gaurav.springboot.thymeleaf.Model.Student;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello";
	}
	@RequestMapping("/sendData")
	public ModelAndView sendData() {
		ModelAndView mav = new ModelAndView("Data");
		mav.addObject("message", "Take up One Idea and make it your life");
		return mav;
	}
	@RequestMapping("/student")
	public ModelAndView getStudent() {
		ModelAndView mav = new ModelAndView("student");
		Student student = new Student();
		student.setName("Gaurav Patidar");
		student.setScore(90);
		mav.addObject("student", student);
		return mav;
	}
	@RequestMapping("/students")
	public ModelAndView getStudents() {
		ModelAndView mav = new ModelAndView("studentList");
		
		Student student = new Student();
		student.setName("Gaurav Patidar");
		student.setScore(90);
		
		Student student1 = new Student();
		student1.setName("Jaya Patidar");
		student1.setScore(33);
		
		List<Student> students = Arrays.asList(student,student1);
		
		mav.addObject("students", students);
		return mav;
	}

}
