package com.gangboot.demo.service;

import com.gangboot.demo.entity.Student;

import java.util.Collection;

public interface StudentService {
    Collection<Student> getAllStudents();
    Student getStudentById(int id);
    void removeStudentById(int id);
    void updateStudent(Student student);
    Collection<Student> insertStudent(Student student);
}
