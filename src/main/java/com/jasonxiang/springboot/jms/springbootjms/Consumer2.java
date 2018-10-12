package com.jasonxiang.springboot.jms.springbootjms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class Consumer2 {

    /**
     * Receive queue message
     * @param text
     */
    @JmsListener(destination = "mytest.queue")
    @SendTo("out.queue")
    public String receiveQueue(String text) {
        System.out.print("Consumer2 收到的报文为: " + text);
        return "return message: " + text;
    }
}
