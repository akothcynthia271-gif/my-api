package com.cyndy.todo_api.dto;

import com.cyndy.todo_api.model.Todo;

import java.time.Instant;
import java.util.UUID;

public record TodoResponse(UUID id, String title, boolean done, Instant createdAt) {
    public static TodoResponse from(Todo todo){
       return new TodoResponse(todo.getId(),todo.getTitle(),todo.isDone(),todo.getCreatedAt());
    }

}
