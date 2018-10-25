package com.gangboot.demo.service;


import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gangboot.demo.dao.StudentDao;
import com.gangboot.demo.entity.Student;

@Service
public class StudentService {

    @Autowired
    @Qualifier("mongoData")
    private StudentDao studentDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentService.class);

    public Collection<Student> getAllStudents(){
       return studentDao.getAllStudents();
    }


    public Student getStudentById(int id) {

        LOGGER.info("**** getStudentById ::: "+id);
        return studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
         this.studentDao.removeStudentById(id);
    }


    public void updateStudent(Student student){
        this.studentDao.updateStudent(student);
    }

    public Collection<Student> insertStudent(Student student){
        this.studentDao.insertStudent(student);
        return this.studentDao.getAllStudents();
    }
}
