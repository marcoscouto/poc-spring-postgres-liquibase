package com.marcoscouto.sql.repository;

import com.marcoscouto.sql.data.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TaskRepository extends CrudRepository<Task, Long> {
}
