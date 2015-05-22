package net.homecredit.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author petr.urban on 21.5.2015.
 */

@Configuration
public class HelperServiceConf {

    @Bean
    public HelperService helperService() {
        return new HelperService();
    }

}
