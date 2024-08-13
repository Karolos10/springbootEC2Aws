package com.example.demospringboot3.web.api;

import com.example.demospringboot3.entity.Course;
import com.example.demospringboot3.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    List<Course> getAll(){
        return courseRepository.findAll();
    }

    @PostMapping
    Course create(@RequestBody Course course){
        return courseRepository.save(course);
    }
}
