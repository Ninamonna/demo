package com.example.demo.repository;

import com.example.demo.model.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag); // поиск в базе данных по тегу
}
