package me.xyh.patchserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity//启用spring security
//@EnableGlobalMethodSecurity(prePostEnabled = true)//会拦截注解了@PreAuthrize注解的配置
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 注入加密算法
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }



}
