package net.homecredit.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author petr.urban on 21.5.2015.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "net.homecredit.test")
public class AppConfig {

    @Bean
    public BoundaryFinder helperService() {
        return new BoundaryFinder();
    }

}
