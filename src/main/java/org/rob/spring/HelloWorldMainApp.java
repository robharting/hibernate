package org.rob.spring;

import org.rob.spring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by robendiane on 21-12-17.
 */
public class HelloWorldMainApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean = context.getBean("myHelloWorldBean", HelloWorld.class);
        helloWorldBean.sayHello();
    }
}
