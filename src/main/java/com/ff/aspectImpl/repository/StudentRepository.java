package com.ff.aspectImpl.repository;

import com.ff.aspectImpl.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {
}
