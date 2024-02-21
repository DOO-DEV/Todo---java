package com.example.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemory implements TodoRepository{
    List<Todo> Todos = new ArrayList<>();
    private Long id = 0L;

    @Override
    public Todo getTodoById(Long id) {
        for (Todo t : Todos) {
            if (t.getId() == id) {
                return t;
            }
        }

        return null;
    }

    @Override
    public Todo saveTodo(Todo todo) {
        id +=1;
        todo.setId(id);
        Todos.add(todo);

        return todo;
    }

    @Override
    public Todo updateTodo(Todo todo) {
        Todo t = this.getTodoById(todo.getId());
        if (t == null) {
            return null;
        }


        int idx = Todos.indexOf(t);
        Todos.remove(t);
        Todos.add(idx, todo);

        return todo;
    }

    @Override
    public void deleteTodo(Long id) {
        Todo t = this.getTodoById(id);
        if (t == null) {
            return;
        }

        Todos.remove(t);
    }

    @Override
    public List<Todo> getAll() {
        return Todos;
    }

}
