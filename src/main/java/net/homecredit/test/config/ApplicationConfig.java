package net.homecredit.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Petr.Urban on 24.2.2015.
 */
@Configuration
@ComponentScan(basePackages = "net.homecredit.test")
public class ApplicationConfig {

//	@Bean
//	public InternalResourceViewResolver internalResourceViewResolver() {
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/api");
//		resolver.setSuffix(".json");
//
//		return resolver;
//	}

}