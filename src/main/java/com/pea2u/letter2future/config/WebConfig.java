package com.pea2u.letter2future.config;


//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.pea2u.letter2future.componet.JwtAuthenticationTokenFilter;
import com.pea2u.letter2future.componet.JwtTokenInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wangzz
 * @date 2019年7月11日19:39:09
 * 拦截器配置类
 * extends WebSecurityConfigurerAdapter
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(jwtTokenInterceptor()).addPathPatterns("/api/wx/customer/notice");
    }

    @Bean
    public JwtTokenInterceptor jwtTokenInterceptor() {
        return new JwtTokenInterceptor();
    }

//    @Bean
//    public FilterRegistrationBean filterRegist() {
//        FilterRegistrationBean frBean = new FilterRegistrationBean();
//        frBean.setFilter(new JwtAuthenticationTokenFilter());
//        frBean.addUrlPatterns("/*");
//        System.out.println("filter");
//        return frBean;
//    }
}
