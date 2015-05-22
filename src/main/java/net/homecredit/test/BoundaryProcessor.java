package net.homecredit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author petr.urban on 21.5.2015.
 */

@ComponentScan("net.homecredit.test")
public class BoundaryProcessor {
    
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("net.homecredit.test");
        ctx.refresh();

        HelperService helperService = ctx.getBean(HelperService.class);

        helperService.run();

    }
}