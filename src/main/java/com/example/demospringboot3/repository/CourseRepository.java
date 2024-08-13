package com.example.demospringboot3.repository;

import com.example.demospringboot3.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
