package de.edittrich.springboot.spike.domain

import org.springframework.data.repository.*

interface TaskListRepository :
  CrudRepository<TaskList, Long>
