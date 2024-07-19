package com.sonny.ctcrm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RabbitMQMessageHandler {

    @RabbitListener(queues = "#{${crm.queues}.split(',')}")
    @RabbitListener(queues = "${user.queue}")
    public void lireMessage(Compte message){
        log.info("Nouveau message {}", message);
    }
}
