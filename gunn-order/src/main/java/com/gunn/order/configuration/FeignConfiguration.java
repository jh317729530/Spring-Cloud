package com.gunn.order.configuration;

import com.gunn.order.interceptor.TestInterceptor;
import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ganjunhui
 * @date 2020/1/5 3:47 下午
 */
@Configuration
public class FeignConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    TestInterceptor testInterceptor() {
        return new TestInterceptor();
    }
}
