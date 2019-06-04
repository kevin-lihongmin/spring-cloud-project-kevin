package com.kevin.zuuldemo;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import io.micrometer.core.instrument.util.MathUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

public class PreRequestLog2Filter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println(String.format("pre filterOrder = 2 %s request to %s", request.getMethod(), request.getRequestURL()));
        } else {
            System.out.println("验证参数错误！");
            throw new RuntimeException("验证参数错误！");
        }
        return null;
    }
}