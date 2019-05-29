package com.homeworks.homework22.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Setter
@Getter
@Accessors(chain = true)
public class User {
    private Long id;

    @Min(0)
    @Max(100)
    private Integer age;

    @Size(min = 1)
    private String name;

    @Email
    private String email;
}
