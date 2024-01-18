package com.ff.aspectImpl.service;

import com.ff.aspectImpl.entity.Student;
import com.ff.aspectImpl.response.ResponseStructure;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    ResponseEntity<ResponseStructure<Student>> saveStudent(Student student);

    ResponseEntity<ResponseStructure<Student>> getStudent(String id);

    ResponseEntity<ResponseStructure<List<Student>>> getStudents();

    ResponseEntity<ResponseStructure<String>> deleteStudent(String id);

    ResponseEntity<ResponseStructure<Student>> getStudentByIdAndName(String id, String name);

  //  ResponseEntity<ResponseStructure<Student>> updateStudent(String id, String cityName);
}
