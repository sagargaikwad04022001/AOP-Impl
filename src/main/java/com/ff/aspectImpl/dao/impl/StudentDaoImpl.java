package com.ff.aspectImpl.dao.impl;

import com.ff.aspectImpl.dao.StudentDao;
import com.ff.aspectImpl.entity.Student;
import com.ff.aspectImpl.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    private MongoTemplate mongoTemplate;


    private StudentRepository studentRepository;
    @Autowired
    public StudentDaoImpl(MongoTemplate mongoTemplate, StudentRepository studentRepository) {
        this.mongoTemplate = mongoTemplate;
        this.studentRepository = studentRepository;
    }


    @Override
    public Student saveStudent(Student student) {
        return mongoTemplate.save(student);
    }

    @Override
    public Student getStudent(String id) {
        return mongoTemplate.findById(id,Student.class);
    }

    @Override
    public List<Student> getStudents() {
        return mongoTemplate.findAll(Student.class);
    }

    @Override
    public boolean deleteStudent(String id) {
        mongoTemplate.findAndRemove(Query.query(Criteria.where("id").is(id)),Student.class);
        return true;
    }

    @Override
    public Student getStudentByIdAndName(String id, String name) {
//        Student student=mongoTemplate.findOne(Query.query(Criteria.where("id").is(id).and("name").is(name)),Student.class);
       Query query=new Query();
       query.addCriteria(Criteria.where("id").is(id));
       query.addCriteria(Criteria.where("name").is(name));
        System.out.println("hii");
       return mongoTemplate.findOne(query,Student.class);
    }
}
