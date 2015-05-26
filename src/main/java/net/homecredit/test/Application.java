package net.homecredit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author petr.urban on 21.5.2015.
 */

@ComponentScan("net.homecredit.test")
public class Application {
    
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(TestServiceConfig.class, TestRepositoryConfig.class, AppConfig.class);
        ctx.scan("net.homecredit.test");
        ctx.refresh();

        BoundaryFinder boundaryFinder = ctx.getBean(BoundaryFinder.class);

        boundaryFinder.run();

    }
}
