package com.cyndy.todo_api.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateTodoRequest(
        @NotBlank(message = "title must not be blank") String title
) {
}
