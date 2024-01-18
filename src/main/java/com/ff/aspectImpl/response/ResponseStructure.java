package com.ff.aspectImpl.response;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
@Document
@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseStructure<T> {
    private int statusCode;
    private String msg;
    private T data;
}
