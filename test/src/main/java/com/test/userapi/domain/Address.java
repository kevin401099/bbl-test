package com.test.userapi.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

    private String street, suite, city, zipcode;
    private Geo geo;

}
