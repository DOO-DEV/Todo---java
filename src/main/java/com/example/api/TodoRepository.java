package com.example.api;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface TodoRepository extends JpaRepository<Todo, Long> {
//}

import java.util.List;

public interface TodoRepository {
    Todo getTodoById(Long id);
    Todo saveTodo(Todo todo);
    Todo updateTodo(Todo todo);
    void deleteTodo(Long id);
    List<Todo> getAll();
}