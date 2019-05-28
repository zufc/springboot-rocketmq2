package com.zfc.study.rocketmq.message.impl;

import com.zfc.study.entity.User;
import com.zfc.study.rocketmq.message.MessageProcessor;
import org.springframework.stereotype.Service;

/**
 * @Author zufeichao
 * @ProjectName springboot-rocketmq2
 * @Description TODO
 * @Date 2019-05-27 17:39
 **/
@Service
public class UserProcessorImpl implements MessageProcessor<User> {

    @Override
    public boolean handleMessage(User user) {
        System.out.println("user receive : " + user.toString());
        return true;
    }

    @Override
    public Class<User> getClazz() {
        return User.class;
    }
}


