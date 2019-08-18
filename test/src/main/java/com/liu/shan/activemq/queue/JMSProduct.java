package com.liu.shan.activemq.queue;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class JMSProduct {
    //默认用户
    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
    //默认密码
    private static final String PASSWORLD = ActiveMQConnection.DEFAULT_PASSWORD;
    //默认链接
    private static final String URL = ActiveMQConnection.DEFAULT_BROKER_URL;


    public static void main(String[] args) {
        //1.连接工厂
        ConnectionFactory connectionFactory;
        //2.连接
        Connection connection = null;
        //3.回话
        Session session;
        //4.目的地
        Destination destination;
        //5.生产者
        MessageProducer messageProducer;
        //实例化工厂
        connectionFactory = new ActiveMQConnectionFactory(USERNAME, PASSWORLD, URL);


        try {
            //获取链接
            connection = connectionFactory.createConnection();
            //启动连接
            connection.start();
            //创建回话
            session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
            //创建队列
            destination = session.createQueue("shanshan");
            //创建生产者
            messageProducer = session.createProducer(destination);


        } catch (JMSException e) {
            e.printStackTrace();
        } finally {

            if (null != connection) {
                try {
                    connection.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }

            }

        }

    }



    

}
