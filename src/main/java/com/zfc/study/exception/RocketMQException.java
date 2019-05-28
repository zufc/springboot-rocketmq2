package com.zfc.study.exception;


/**
 * @Author zufeichao
 * @ProjectName springboot-rocketmq2
 * @Description TODO
 * @Date 2019-05-27 17:43
 **/
public class RocketMQException extends Exception {

    private String message;

    public  RocketMQException(String message){
        this.message = message;
        System.out.println(this.message);

    }

}
