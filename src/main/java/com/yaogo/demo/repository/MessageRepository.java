package com.yaogo.demo.repository;

import com.yaogo.demo.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
