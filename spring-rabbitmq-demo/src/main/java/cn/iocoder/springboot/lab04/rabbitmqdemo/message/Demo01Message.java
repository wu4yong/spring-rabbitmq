package cn.iocoder.springboot.lab04.rabbitmqdemo.message;

import java.io.Serializable;

public class Demo01Message implements Serializable {
    // 消息队列
    public static final String QUEUE = "QUEUE_DEMO_01";
    // 交换器
    public static final String EXCHANGE = "EXCHANGE_DEMO_01";
    // 路由
    public static final String ROUTING_KEY = "ROUTING_KEY_01";

    /**
     * 编号
     */
    private Integer id;

    public Demo01Message setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Demo01Message{" +
                "id=" + id +
                '}';
    }

}
