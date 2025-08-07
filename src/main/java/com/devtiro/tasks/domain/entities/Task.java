package com.devtiro.tasks.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = " tasks")
public class Task {
    @Id

    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "title" , nullable = false , updatable = true)
    private String Title;

    @Column(name = "description")
    private String description;

    @Column(name = "due_date")
    private LocalDateTime dueDate;

    @Column(name = "status",nullable = false)
    private TaskStatus status;

    @Column(name = "priority",nullable = false)
    private TaskPrioirity prioirity;

    @Column(name = "created",nullable = false)
    private LocalDateTime created;

    @Column(name = "updated", nullable = false)
    private LocalDateTime updated;

    public Task() {
    }

    public Task(UUID id, String title, String description, LocalDateTime dueDate, TaskPrioirity prioirity, TaskStatus status, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        Title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.prioirity = prioirity;
        this.created = created;
        this.updated = updated;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskPrioirity getPrioirity() {
        return prioirity;
    }

    public void setPrioirity(TaskPrioirity prioirity) {
        this.prioirity = prioirity;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(Title, task.Title) && Objects.equals(description, task.description) && Objects.equals(dueDate, task.dueDate) && status == task.status && prioirity == task.prioirity && Objects.equals(created, task.created) && Objects.equals(updated, task.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Title, description, dueDate, status, prioirity, created, updated);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", Title='" + Title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", status=" + status +
                ", prioirity=" + prioirity +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
