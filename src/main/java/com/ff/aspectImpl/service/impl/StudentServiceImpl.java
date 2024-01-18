package com.ff.aspectImpl.service.impl;

import com.ff.aspectImpl.dao.StudentDao;
import com.ff.aspectImpl.entity.Student;
import com.ff.aspectImpl.response.ResponseStructure;
import com.ff.aspectImpl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public ResponseEntity<ResponseStructure<Student>> saveStudent(Student student) {
           return new ResponseEntity<ResponseStructure<Student>>(new ResponseStructure<Student>(HttpStatus.CREATED.value(), "Data saved",studentDao.saveStudent(student)),HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<ResponseStructure<Student>> getStudent(String id) {
        return new ResponseEntity<ResponseStructure<Student>>(new ResponseStructure<Student>(HttpStatus.FOUND.value(), "Data found",studentDao.getStudent(id)),HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<ResponseStructure<List<Student>>> getStudents() {
        return new ResponseEntity<ResponseStructure<List<Student>>>(new ResponseStructure<List<Student>>(HttpStatus.FOUND.value(), "Data found",studentDao.getStudents()),HttpStatus.FOUND);

    }

    @Override
    public ResponseEntity<ResponseStructure<String>> deleteStudent(String id) {
        studentDao.deleteStudent(id);
        return new ResponseEntity<ResponseStructure<String>>(new ResponseStructure<String>(HttpStatus.OK.value(), "Data removed","Data Removed"),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseStructure<Student>> getStudentByIdAndName(String id, String name) {
        Student student=studentDao.getStudentByIdAndName(id,name);
        return new ResponseEntity<ResponseStructure<Student>>(new ResponseStructure<Student>(HttpStatus.FOUND.value(), "Data found",studentDao.getStudentByIdAndName(id,name)),HttpStatus.FOUND);

    }

    //@Override
   // public ResponseEntity<ResponseStructure<Student>> updateStudent(String id, String cityName) {
//        Student student=;
//    }
}
