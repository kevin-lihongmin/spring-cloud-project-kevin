package com.kevin.feignconsumer;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 *  自定义实现路由策略 {@link com.netflix.loadbalancer.IRule}
 *
 */
public class MyServerForeverRule extends AbstractLoadBalancerRule {


    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {
        ILoadBalancer loadBalancer = getLoadBalancer();

        // 返回三个配置 Server，即：
        // person-service.ribbon.listOfServers = \
        // http://localhost:9090,http://localhost:9090,http://localhost:9090
        List<Server> allServers = loadBalancer.getAllServers();

        return allServers.get(0);

    }
}
