package com.gangboot.demo.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.gangboot.demo.entity.Student;

import javax.sql.DataSource;

@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao{



    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(1,"Nagesh", "CSE"));
                add(new Student(2,"Muthu", "Arts"));
                add(new Student(3,"Pandiyar", "Political Science"));
                add(new Student(4,"Pandiyar", "Political Science"));
                add(new Student(5,"Pandiyar1", "Political Science"));
                add(new Student(6,"Pandiyar2", "Political Science"));
                add(new Student(7,"Pandiyar3", "Political Science"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return getAllStudents().stream()
        	    .filter(p -> p.getId()==id).findFirst()
                .orElse(null);
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudent(Student student) {

    }
}
