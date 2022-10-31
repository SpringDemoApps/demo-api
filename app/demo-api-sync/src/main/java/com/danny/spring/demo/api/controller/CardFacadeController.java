package com.danny.spring.demo.api.controller;



import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin
public class CardFacadeController {

    @Autowired
    private RedissonClient client;

    @PostMapping(value = {"/api/v1/sync"})
    public String syncRequest(@RequestBody @Validated String request) {
        client.getAtomicLong("test_key").incrementAndGet();
        return client.getAtomicLong("test_key").toString();
    }

}
