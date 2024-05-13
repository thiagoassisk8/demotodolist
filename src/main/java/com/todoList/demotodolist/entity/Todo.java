package com.todoList.demotodolist.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "todos")
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String name;

  @NotBlank
  private String description;

  private boolean done;

  private int priority;

  private int timeEstimation;

  @ManyToOne
  private Category category;

  public Todo() {
  }

  public Todo(Long id, @NotBlank String name, @NotBlank String description, boolean done, int priority,
      int timeEstimation, Category category) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.done = done;
    this.priority = priority;
    this.timeEstimation = timeEstimation;
    this.category = category;
  }

  public Todo(String name, String description, boolean done, int priority, int timeEstimation, Category category) {
    this.name = name;
    this.description = description;
    this.done = done;
    this.priority = priority;
    this.timeEstimation = timeEstimation;
    this.category = category;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public int getPriority() {
    return priority;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  }

  public int getTimeEstimation() {
    return timeEstimation;
  }

  public void setTimeEstimation(int timeEstimation) {
    this.timeEstimation = timeEstimation;
  }

  @Override
  public boolean equals(Object obj) {
    return EqualsBuilder.reflectionEquals(obj, this);
  }
}
