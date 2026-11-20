package com.cyndy.todo_api.exception;

import java.util.UUID;

public class TodoNotFoundException extends RuntimeException{
    public TodoNotFoundException(UUID id){
        super("Todo not found"+ id);
    }
}
