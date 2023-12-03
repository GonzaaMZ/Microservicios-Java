package com.microservice.course.services;

import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentByCouseResponse;

import java.util.List;

public interface CourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCouseResponse findAllStudentByCourse(Long idCourse);
}
