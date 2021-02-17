package com.solomonzelenko.getorders.repositories;

import com.solomonzelenko.getorders.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agent, Long>
{
}