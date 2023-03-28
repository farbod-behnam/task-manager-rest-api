package com.taskmanager.entities;

import jakarta.persistence.*;
import org.bson.types.ObjectId;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String text;

    public Task() {
    }

    public Task(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Task[" + "id=" + id + ", text='" + text + '\'' + ']';
    }
}
