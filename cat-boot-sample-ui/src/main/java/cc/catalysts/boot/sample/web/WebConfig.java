package cc.catalysts.boot.sample.web;

import cc.catalysts.boot.sample.Webjars;
import cc.catalysts.boot.thymeleaf.webjars.WebjarRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Joel Colledge
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    /**
     * Make the webjars listed by cat-gradle-webjars-plugin available to
     * cat-boot-thymeleaf so that we can refer to artifacts in the webjars
     * without being concerned about versions.
     *
     * @return A function to access the generated webjar map
     */
    @Bean
    public WebjarRegistrar catBootSampleWebjars() {
        return () -> Webjars.webjars;
    }
}
