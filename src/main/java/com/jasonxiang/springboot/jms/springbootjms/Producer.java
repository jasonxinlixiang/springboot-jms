package com.jasonxiang.springboot.jms.springbootjms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

@Service("producer")
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * Produce message
     * @param destination destination
     * @param message message
     */
    public void sendMessage(Destination destination, final String message) {
        jmsMessagingTemplate.convertAndSend(destination, message);
    }

    @JmsListener(destination = "out.queue")
    public void consumerMessage(String text) {
        System.out.print("从out.queue队列收到的回复报文为: " + text);
    }
}
