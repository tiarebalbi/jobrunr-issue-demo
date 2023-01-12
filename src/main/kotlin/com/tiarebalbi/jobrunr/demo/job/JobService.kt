package com.tiarebalbi.jobrunr.demo.job

import com.tiarebalbi.jobrunr.demo.task1.Task
import com.tiarebalbi.jobrunr.demo.task1.TaskRepository
import org.jobrunr.jobs.annotations.Job
import org.jobrunr.jobs.context.JobRunrDashboardLogger
import org.jobrunr.spring.annotations.Recurring
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class JobService(private val taskRepository: TaskRepository) {
    private val logger = JobRunrDashboardLogger(LoggerFactory.getLogger(this::class.java))

    @Job(name = "Process Tasks", retries = 0)
    @Recurring(id = "process-tasks", interval = "PT10S")
    fun process() {
        val random = Task.random()
        logger.info("Creating task $random")
        this.taskRepository.save(random)
    }
}
