package com.kodilla.hibernate.task.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.config.Task;

public interface TaskDao extends CrudRepository<Task, Integer> {
}
