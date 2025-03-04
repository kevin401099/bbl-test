package com.test.userapi.domain;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

//To do list add Entity for implmening JPA
@Getter
@Setter
public class User {

    private Long id;
    private String name, username, email, phone, website;
    private Address address;
}
