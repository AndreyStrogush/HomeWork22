package com.homeworks.homework22.listeners;

import com.homeworks.homework22.model.CreatableEntity;

import javax.persistence.PrePersist;
import java.util.Date;

public class CreatableEntityListener {
    @PrePersist
    public void prePersist(CreatableEntity entity) {
        entity.setDate(new Date().getTime());
    }
}
