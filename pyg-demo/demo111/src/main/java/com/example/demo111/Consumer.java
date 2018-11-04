package com.example.demo111;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 消费者
 */
@Component
public class Consumer {
    @JmsListener(destination="itcast")
    public void readMessage(String text){
        System.out.println("接收的消息:"+text);
    }


    @JmsListener(destination = "itcast_map")
    public void readMap(Map map){

        System.out.println(map);




    }


}
