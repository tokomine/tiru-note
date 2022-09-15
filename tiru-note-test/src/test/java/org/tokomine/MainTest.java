package org.tokomine;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.tokomine.tirunote.test.Main;
import org.tokomine.tirunote.test.component.SpringComponent;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Main.class)
public class MainTest {

    /**
     * Should print hello world when the springcomponent is injected
     */
    @Test
    public void mainWhenSpringComponentIsInjectedThenPrintHelloWorld() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        SpringComponent springComponent = context.getBean(SpringComponent.class);
        springComponent.print();
    }
}