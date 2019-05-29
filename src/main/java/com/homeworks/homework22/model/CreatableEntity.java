package com.homeworks.homework22.model;

import com.homeworks.homework22.listeners.CreatableEntityListener;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
@EqualsAndHashCode(callSuper = false)
@EntityListeners(value = CreatableEntityListener.class)
public class CreatableEntity extends BaseEntity {
    private Long date;
}
