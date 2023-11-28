package com.yunbin.schoolManagement.controller;

import com.yunbin.schoolManagement.model.Person;
import com.yunbin.schoolManagement.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("teacher")
public class TeacherController {
    private final PersonService personService;

    @Autowired
    public TeacherController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/all")
    public String getAllTeachers(Model model) {
        List<Person> teachers = personService.getAllTeachers();
        model.addAttribute("teachers", teachers);
        return "yourTemplate"; // Replace with your actual template name
    }
}
