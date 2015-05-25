package net.homecredit.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author petr.urban on 21.5.2015.
 */

@Configuration
@EnableWebMvc
public class AppConfig {

    @Bean
    public HelperService helperService() {
        return new HelperService();
    }

}
