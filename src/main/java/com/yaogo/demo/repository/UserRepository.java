package com.yaogo.demo.repository;

import com.yaogo.demo.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
