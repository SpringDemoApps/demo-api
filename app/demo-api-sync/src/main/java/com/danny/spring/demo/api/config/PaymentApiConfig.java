package com.danny.spring.demo.api.config;

import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class PaymentApiConfig {

    @Autowired
    private RedissonClient client;

//    @Bean("idService")
//    public IDGeneratorService initIdService(RedissonClient client){
//        Long instanceId = client.getAtomicLong(
//                PaymentSystem.PAYMENT_API.getDesc().toLowerCase() + "_instanceid_counter"
//        ).incrementAndGet();
//        log.info("instanceId = $instanceId");
//        return new IDServiceImplV1(instanceId.toString(), PaymentSystem.PAYMENT_CORE);
//    }
}
