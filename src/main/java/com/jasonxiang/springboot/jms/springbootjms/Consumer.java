package com.jasonxiang.springboot.jms.springbootjms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    /**
     * Receive queue message
     * @param text
     */
    @JmsListener(destination = "mytest.queue")
    public void receiveQueue(String text) {
        System.out.print("Consumer收到的报文为:" + text);
    }
}
