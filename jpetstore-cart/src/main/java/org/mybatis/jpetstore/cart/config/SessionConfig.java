package org.mybatis.jpetstore.cart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

@Configuration
public class SessionConfig {
    @Bean
    public CookieSerializer cookieSerializer(){
        DefaultCookieSerializer cookieSerializer = new DefaultCookieSerializer();
        cookieSerializer.setDomainName("localhost");
        cookieSerializer.setCookieName("PETSESSION");
        return cookieSerializer;
    }
//    @Bean
//    public RedisSerializer<Object> springSessionDefaultRedisSerializer(){
//        return new GenericJackson2JsonRedisSerializer();
//    }
}
