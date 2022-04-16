package de.edittrich.springboot.spike.domain

import de.edittrich.springboot.spike.domain.Task
import javax.persistence.*

@Entity
class TaskList(var title: String) {
  @Id
  @GeneratedValue(
    strategy = GenerationType.IDENTITY
  )
  val id: Long = 0

  @OneToMany(
    cascade = [CascadeType.REMOVE]
  )
  @JoinTable(
    name = "tasklist_task",
    joinColumns = [
      JoinColumn(name = "list_id")
    ],
    inverseJoinColumns = [
      JoinColumn(name = "task_id")
    ]
  )
  val tasks = mutableListOf<Task>()
}
