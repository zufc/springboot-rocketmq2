package com.zfc.study.rocketmq.message.impl;

import com.zfc.study.rocketmq.message.MessageProcessor;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.stereotype.Service;

/**
 * @Author zufeichao
 * @ProjectName springboot-rocketmq
 * @Description TODO
 * @Date 2019-05-27 9:35
 **/
@Service
public class MessageProcessorImpl implements MessageProcessor {

    @Override
    public boolean handleMessage(Object message) {
        return false;
    }

    @Override
    public Class getClazz() {
        return null;
    }

    @Override
    public Object transferMessage(String message) {
        return null;
    }
}


