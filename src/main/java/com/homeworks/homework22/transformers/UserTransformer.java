package com.homeworks.homework22.transformers;

import com.homeworks.homework22.dto.User;
import com.homeworks.homework22.model.UserEntity;
import com.homeworks.homework22.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserTransformer {
    private final UserRepository repository;

    public void addUser(User user) {
        repository.save(buildEntity(user));
    }

    public void updateUser(User user) {
        repository.save(buildEntity(user));
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }

    public List<User> findAll() {
        List<UserEntity> entities = repository.findAll();
        return buildUsers(entities);
    }

    public User findOne(Long id) {
        return buildUser(repository.findById(id).orElseThrow(IllegalArgumentException::new));
    }

    private User buildUser(UserEntity entity) {
        return new User()
                .setId(entity.getId())
                .setAge(entity.getAge())
                .setName(entity.getName())
                .setEmail(entity.getEmail());
    }

    private List<User> buildUsers(List<UserEntity> entities) {
        return entities.stream()
                .map(this::buildUser)
                .collect(toList());
    }

    private UserEntity buildEntity(User user) {
        UserEntity entity;
        if(user.getId() == null) {
            entity = new UserEntity();
        } else entity = repository.findById(user.getId()).orElseThrow(IllegalArgumentException::new);
        entity
                .setAge(user.getAge())
                .setName(user.getName())
                .setEmail(user.getEmail());
        user.setId(entity.getId());
        return entity;
    }
}
