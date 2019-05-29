package com.homeworks.homework22.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "users")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class UserEntity extends CreatableEntity {
    private Integer age;
    private String name;
    private String email;
}
