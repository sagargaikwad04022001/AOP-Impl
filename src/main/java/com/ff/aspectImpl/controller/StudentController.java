package com.ff.aspectImpl.controller;

import com.ff.aspectImpl.config.Logging;
import com.ff.aspectImpl.entity.Student;
import com.ff.aspectImpl.response.ResponseStructure;
import com.ff.aspectImpl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Logging
    @PostMapping("student")
    public ResponseEntity<ResponseStructure<Student>> saveStudent(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }

    @Logging
    @GetMapping("student/{id}")
    public ResponseEntity<ResponseStructure<Student>> getStudent(@PathVariable String id)
    {
        return studentService.getStudent(id);
    }

    @Logging
    @GetMapping("students")
    public ResponseEntity<ResponseStructure<List<Student>>> getStudents()
    {
        return studentService.getStudents();
    }
    @Logging
    @DeleteMapping("student/{id}")
    public ResponseEntity<ResponseStructure<String>> deleteStudent(@PathVariable String id)
    {
        return studentService.deleteStudent(id);
    }
    @Logging
    @GetMapping("student")
    public ResponseEntity<ResponseStructure<Student>> getStudentByIdAndName(@RequestParam String id,@RequestParam String name)
    {
        return studentService.getStudentByIdAndName(id,name);
    }

//    @PutMapping("student/{id}")
//    public ResponseEntity<ResponseStructure<Student>> updateStudent(@PathVariable String id,@RequestParam String cityName)
//    {
//     //   return studentService.updateStudent(id,cityName);
//    }

}
