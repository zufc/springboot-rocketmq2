package com.zfc.study.entity;

import java.io.Serializable;

/**
 * @Author zufeichao
 * @ProjectName springboot-rocketmq2
 * @Description TODO
 * @Date 2019-05-27 17:41
 **/
public class Panda implements Serializable {
    private static final long serialVersionUID = -470078490582001132L;
    private String name;
    private Integer age;

    public Panda() {
    }

    public Panda(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Panda{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



