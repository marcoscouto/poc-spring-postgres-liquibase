package com.marcoscouto.sql.data;

import javax.persistence.*;
import java.time.LocalDate;

import static java.time.LocalDate.now;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "registry_date", nullable = false)
    private LocalDate registryDate;

    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @Deprecated
    public Task() {
    }

    public Task(String description, LocalDate endDate) {
        this.description = description;
        this.endDate = endDate;
    }

    @PrePersist
    private void getDate() {
        this.registryDate = now();
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getRegistryDate() {
        return registryDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

}
