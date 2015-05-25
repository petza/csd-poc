package net.homecredit.test.config;

import net.homecredit.test.BoundaryFinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Petr.Urban on 24.2.2015.
 */
@Configuration
@EnableWebMvc
public class ApplicationConfig {
    
    @Bean
    public BoundaryFinder boundaryFinder() {
        return new BoundaryFinder();
    }

}
