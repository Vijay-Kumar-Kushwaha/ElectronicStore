package com.lcwd.electronic.store.dtos;

import com.lcwd.electronic.store.validate.ImageNameValid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.aspectj.bridge.IMessage;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private String userId;
    @Size(min = 3, max = 20, message = "Invalid name")
    private String name;

    @Pattern(regexp = "^[A-Za-z0-9][-A-Za-z0-9._]+@([A-Za-z0-9]+\\.)+[A-Za-z]{2,5}$", message = "Invalid user email !!")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "password is required")
    private String password;

    @Size(min = 4, max = 6, message = "invalid gender")
    private String gender;

    @NotBlank(message = "Write something about yourself")
    private String about;

    @ImageNameValid
    private String imageName;


    //pattern annotation
    //custom validator

}
