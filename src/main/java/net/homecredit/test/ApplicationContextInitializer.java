package net.homecredit.test;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author vavras
 */
public class ApplicationContextInitializer implements org.springframework.context.ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment environment = applicationContext.getEnvironment();

        String[] activeProfiles = environment.getActiveProfiles();

        environment.setActiveProfiles(ArrayUtils.addAll(Application.ACTIVE_PROFILES, activeProfiles));
    }
}
