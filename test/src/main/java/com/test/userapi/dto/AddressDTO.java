package com.test.userapi.dto;

import com.test.userapi.domain.Geo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {

    private String street, suite, city, zipcode;
    private Geo geo;

}
