package com.example.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//@Entity
public class Todo {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean completed;

    // getters and setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setCompleted() {
        this.completed = true;
    }


    public boolean getCompleted() {
        return completed;
    }
}