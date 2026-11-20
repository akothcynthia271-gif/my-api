package com.cyndy.todo_api.model;

import java.time.Instant;
import java.util.UUID;

public class Todo {
    private UUID id;
    private String title;
    private boolean done;
    private Instant createdAt;

    public Todo(UUID id,String title,boolean done,Instant createdAt){
    this.id=id;
    this.title = title;
    this.done= done;
    this.createdAt= createdAt;
    }
    public UUID getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public boolean isDone(){
        return done;
    }
    public Instant getCreatedAt(){
        return createdAt;
    }
    public void setTitle(String title){
        this.title= title;
    }
    public void setDone(boolean done){
        this.done=done;
    }
}
