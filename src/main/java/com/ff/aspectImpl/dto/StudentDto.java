package com.ff.aspectImpl.dto;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
public class StudentDto {
  private String name;
  private CollegeDto collegeDto;
}
