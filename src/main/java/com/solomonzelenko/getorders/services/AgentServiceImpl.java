package com.solomonzelenko.getorders.services;

import com.solomonzelenko.getorders.models.Agent;
import com.solomonzelenko.getorders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "agentServices")
public class AgentServiceImpl implements AgentServices
{
    @Autowired
    private AgentsRepository agentsrepos;

    @Transactional
    @Override
    public Agent save(Agent agent){
        return agentsrepos.save(agent);
    }

    @Override
    public Agent findAgentById(long agentcode) {
        Agent agent = agentsrepos.findById(agentcode).orElseThrow(() -> new EntityNotFoundException());
        return agent;
    }
}