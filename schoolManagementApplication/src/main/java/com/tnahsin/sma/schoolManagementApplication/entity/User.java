package com.tnahsin.sma.schoolManagementApplication.entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Getter
@Setter
public class User {

    @Id
    private ObjectId id;

    private String username;
    private String password;
    @Getter
    private String role;


}