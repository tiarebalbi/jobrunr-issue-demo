package com.tiarebalbi.jobrunr.demo.task1

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "data", path = "tasks")
interface TaskRepository : PagingAndSortingRepository<Task, String>, CrudRepository<Task, String>
