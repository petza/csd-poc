package net.homecredit.test.config;

import net.homecredit.embedit.framework.common.config.CommonRepositoryConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author petr.urban on 22.5.2015.
 */

@Configuration
@Import(CommonRepositoryConfig.class)
public class TestRepositoryConfig {
}
