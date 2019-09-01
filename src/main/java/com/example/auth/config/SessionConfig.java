package com.example.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * created by cxming on 2019/6/30
 */
@Configuration
public class SessionConfig implements WebMvcConfigurer {

    @Bean
    public SessionInterceptor getSessionInterceptor() {
        return new SessionInterceptor();
    }

    private class SessionInterceptor extends HandlerInterceptorAdapter {
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                                 Object handler) throws Exception {
            HttpSession session = request.getSession(false);
            if (session == null) {
                response.sendRedirect("/index.html");
                return false;
            }
            return true;
        }
    }

    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration addInterceptor = registry.addInterceptor(getSessionInterceptor());

        // 拦截配置
        addInterceptor.addPathPatterns("/**")
                .excludePathPatterns("/index.html")
                .excludePathPatterns("/login");
//                .excludePathPatterns("/img/**");

    }


}
