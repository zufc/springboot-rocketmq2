package com.zfc.study.rocketmq.message.impl;

import com.zfc.study.entity.Panda;
import com.zfc.study.rocketmq.message.MessageProcessor;
import org.springframework.stereotype.Service;

/**
 * @Author zufeichao
 * @ProjectName springboot-rocketmq2
 * @Description TODO
 * @Date 2019-05-27 17:40
 **/
@Service
public class AnimalProcessorImpl implements MessageProcessor<Panda> {

    @Override
    public boolean handleMessage(Panda message) {
        System.out.println("animal receive:" + message.toString());
        return true;
    }

    @Override
    public Class<Panda> getClazz() {
        return Panda.class;
    }
}


