package net.homecredit.test;

import net.homecredit.embedit.framework.common.config.RestConfig;
import net.homecredit.test.config.ApplicationConfig;
import net.homecredit.test.config.TestRepositoryConfig;
import net.homecredit.test.config.TestServiceConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author petr.urban on 21.5.2015.
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
@Import({ApplicationConfig.class, TestRepositoryConfig.class, TestServiceConfig.class, RestConfig.class})
public class Application {

    public static final String[] ACTIVE_PROFILES = {"securityCaching"};
    
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class)
                                                        .initializers(new ApplicationContextInitializer())
                                                        .run(args);
//        context.refresh();
//
//        BoundaryFinder boundaryFinder = context.getBean(BoundaryFinder.class);
//        boundaryFinder.run();
    }
}
