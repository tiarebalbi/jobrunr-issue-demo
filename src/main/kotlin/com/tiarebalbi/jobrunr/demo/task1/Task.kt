package com.tiarebalbi.jobrunr.demo.task1

import org.springframework.data.mongodb.core.mapping.Document
import java.time.Duration

@Document(collection = "tasks")
data class Task(
    var id: String? = null,
    val name: String,
    val description: String,
    val duration: Duration = Duration.ofSeconds(10)
) {
    companion object {
        fun random(): Task {
            return Task(
                name = "Task ${Math.random()}",
                description = "Description ${Math.random()}"
            )
        }
    }
}
