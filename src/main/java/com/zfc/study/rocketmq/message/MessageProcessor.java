package com.zfc.study.rocketmq.message;

import com.zfc.study.util.JsonUtil2;
import org.apache.rocketmq.common.message.MessageExt;

/**
 * @Author zufeichao
 * @ProjectName springboot-rocketmq
 * @Description TODO
 * @Date 2019-05-27 9:34
 **/
public interface  MessageProcessor<T> {

    boolean handleMessage(T message);

    Class<T> getClazz();

    default T transferMessage(String message) {
        return JsonUtil2.fromJson(message, getClazz());
    }

}




