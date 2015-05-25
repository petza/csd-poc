package net.homecredit.test;

import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;

/**
 * @author petr.urban on 21.5.2015.
 */

@Configuration
public class BoundaryTest {

    private static org.slf4j.Logger LOG = LoggerFactory.getLogger(BoundaryTest.class);

    public static void main(String[] args) {

        new SpringApplicationBuilder(BoundaryTest.class).initializers().run(args);
        
        


    }
}
