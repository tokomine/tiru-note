package org.tokomine.tirunote.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.tokomine.tirunote.test.component.SpringComponent;

/**
 * @author tokomine
 */
@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        SpringComponent springComponent = context.getBean(SpringComponent.class);
        springComponent.print();
    }
}