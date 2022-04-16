package de.edittrich.springboot.spike.domain

import org.springframework.data.repository.*

interface TaskRepository :
  CrudRepository<Task, Long>
