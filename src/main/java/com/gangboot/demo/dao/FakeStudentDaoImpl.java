package com.gangboot.demo.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.gangboot.demo.entity.Student;

@Repository
@Qualifier("fakeData")
public class FakeStudentDaoImpl implements StudentDao {

    private static Map<Integer,Student> students;
    static {
        students = new HashMap<Integer,Student>(){
            {
                put(1,new Student(1,"Saith","Computer Science"));
                put(2,new Student(2,"Alex U","Arts"));
                put(3,new Student(3,"Anna","Maths"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents(){
        return this.students.values();
    }



    @Override
    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student) {
          Student s = students.get(student.getId());
                  s.setCourse(student.getCourse());
                  s.setName(student.getName());
                  this.students.put(student.getId(),s);
    }

    @Override
    public void insertStudent(Student student) {
        this.students.put(student.getId(),student);
    }
}
