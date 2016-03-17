package cc.catalysts.boot.sample.web;

import cc.catalysts.boot.sample.Webjars;
import cc.catalysts.boot.thymeleaf.webjars.WebjarRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.ContentVersionStrategy;
import org.springframework.web.servlet.resource.FixedVersionStrategy;
import org.springframework.web.servlet.resource.ResourceUrlEncodingFilter;
import org.springframework.web.servlet.resource.VersionResourceResolver;

/**
 * @author Joel Colledge
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Bean
    public WebjarRegistrar catBootSampleWebjars() {
        return () -> Webjars.webjars;
    }
}
