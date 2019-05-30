# `spring-cloud-project-kevin` (spring cloud相关组件)

#### `eureka-client Eureka` 的接入客户端


#### `eureka-server` Eureka服务器集群


#### `feign-demo` Feign实现服务的调用
* `api` 服务端与客户端调用的链接点（API）
* `user-provider` Feign服务端
* `user-consumer` Feign客户端


#### `hystrix-client` Hystrix服务断路器


#### `hystrix-dashboard` 熔断器UI，监控hystrix-client服务的信息


#### `ribbon-demo` ribbon实现服务的调用
* `ribbon-provider` 提供服务列表
* `ribbon-consumer` 客户端本地配置Ribbon服务列表，实现客户端的负载均衡
* `ribbon-consumer-eureka` 客户端根据服务端的名称从注册中心获取服务列表，在客户端进行负载均衡


#### `zipkin-demo` 服务调用链（sleuth-consumer -> sleuth-provider -> sleuth-provider-provider）
* `sleuth-consumer` 客户端
* `sleuth-provider` 服务端
* `sleuth-provider-provider` 服务端的服务端


#### `zuul-demo` Api网关

#### `spring-cloud-zookeeper-demo` Zookeeper注册中心（服务的提供端和调用端相对于Zookeeper都它的是客户端，所以子项目都加了`-client-`）
* `zookeeper-client-provider` 服务端
* `zookeeper-client-consumer` 服务的客户端

