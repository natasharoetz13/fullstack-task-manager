package com.natasha.backend.repository;

import com.natasha.backend.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository
extends JpaRepository<Task, Long> {
}
