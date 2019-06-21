package com.ioc;

import com.ioc.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:contextfiles/application-message.xml");
        System.out.println("run success");
        MessageService messageService = context.getBean(MessageService.class);
        System.out.println(messageService.getMessage());
    }
}