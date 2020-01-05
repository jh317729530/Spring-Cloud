package com.gunn.order.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;

/**
 * @author ganjunhui
 * @date 2020/1/5 4:01 下午
 */
@Slf4j
public class TestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        log.info("apply TestInteceptor");
    }
}
