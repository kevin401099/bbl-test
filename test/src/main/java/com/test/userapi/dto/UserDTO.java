package com.test.userapi.dto;

import com.test.userapi.domain.Address;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    @NotNull(message = "ID is required")
    private Long id;

    @NotBlank(message = "name is required")
    @Size(min = 3, max = 25, message = "name must be between 3 and 20 characters")
    private String name;
    private String username, email, phone, website;
    private AddressDTO address;

}
