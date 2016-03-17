package cc.catalysts.boot.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

/**
 * @author Joel Colledge
 */
@Configuration
public class LocaleConfig {

    @Bean
    public LocaleResolver localeResolver() {
        return new CookieLocaleResolver();
    }
}
