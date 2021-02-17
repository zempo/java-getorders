package com.solomonzelenko.getorders.controllers;

import com.solomonzelenko.getorders.models.Agent;
import com.solomonzelenko.getorders.services.AgentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agents")
public class AgentController
{

    @Autowired
    private AgentServices agentServices;

    // http://localhost:2019/agents/agent/{agentcode}
    @GetMapping(value = "/agent/{agentcode}", produces = "application/json")
    public ResponseEntity<?> findAgentById(@PathVariable long agentcode) {
        Agent agent = agentServices.findAgentById(agentcode);
        return new ResponseEntity<>(agent, HttpStatus.OK);
    }
}