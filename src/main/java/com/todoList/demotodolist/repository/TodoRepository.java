package com.todoList.demotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoList.demotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
