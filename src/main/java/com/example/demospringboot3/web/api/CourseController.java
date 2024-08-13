package com.example.demospringboot3.web.api;

import com.example.demospringboot3.entity.Course;
import com.example.demospringboot3.repository.CourseRepository;
import com.example.demospringboot3.service.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private S3Service s3Service;

    @GetMapping
    List<Course> getAll(){
        return courseRepository.findAll().stream().peek(course -> course.setImageUrl(s3Service
                .getObjectUrl(course.getImagePath()))).collect(Collectors.toList());
    }

    @PostMapping
    Course create(@RequestBody Course course){
        courseRepository.save(course);
        course.setImageUrl(s3Service.getObjectUrl(course.getImagePath()));
        return course;
    }
}
