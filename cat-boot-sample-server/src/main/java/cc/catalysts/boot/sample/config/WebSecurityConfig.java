package cc.catalysts.boot.sample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Joel Colledge
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity webSecurity) throws Exception {
        // permit all static resources
        webSecurity.ignoring()
                .antMatchers("/css/**")
                .antMatchers("/lesscss/**")
                .antMatchers("/static/**")
                .antMatchers("/js/**")
                .antMatchers("/ui/**")
                .antMatchers("/fonts/**")
                .antMatchers("/images/**")
                .antMatchers("/webjars/**")
                .antMatchers("/api-docs/**")
                .antMatchers("/favicon.ico");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/**").permitAll();
    }
}
