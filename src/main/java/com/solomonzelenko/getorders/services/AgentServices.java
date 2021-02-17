package com.solomonzelenko.getorders.services;

import com.solomonzelenko.getorders.models.Agent;

public interface AgentServices
{
    public Agent save(Agent agent);

    Agent findAgentById(long agentcode);
}
