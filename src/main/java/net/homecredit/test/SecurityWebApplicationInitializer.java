package net.homecredit.test;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Registers the springSecurityFilterChain.
 * This requires at least Servlet API version 3.0 or later.
 * @author attila.pal
 */
@Order(1)
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer
{
}
