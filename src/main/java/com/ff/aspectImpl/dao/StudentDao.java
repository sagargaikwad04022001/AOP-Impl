package com.ff.aspectImpl.dao;

import com.ff.aspectImpl.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {

    Student saveStudent(Student student);

    Student getStudent(String id);

    List<Student> getStudents();

    boolean deleteStudent(String id);

    Student getStudentByIdAndName(String id, String name);
}
