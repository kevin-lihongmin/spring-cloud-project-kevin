# `spring-cloud-project-kevin` (spring cloud相关组件)

#### `eureka-client Eureka` 的接入客户端


#### `eureka-server` Eureka服务器集群


#### `feign-demo` Feign实现服务的调用
* `api` 服务端与客户端调用的链接点（API）
* `user-provider` Feign服务端
* `user-consumer` Feign客户端


#### `hystrix-client` Hystrix服务断路器


#### `hystrix-dashboard` 熔断器UI，监控hystrix-client服务的信息


#### `user-provider` ribbon服务端
#### `user-consumer` ribbon客户端


#### `zipkin-demo` 服务调用链（sleuth-consumer -> sleuth-provider -> sleuth-provider-provider）
* `sleuth-consumer` 客户端
* `sleuth-provider` 服务端
* `sleuth-provider-provider` 服务端的服务端


#### `zuul-demo` Api网关

#### `spring-cloud-zookeeper-demo` Zookeeper注册中心（服务的提供端和调用端相对于Zookeeper都它的是客户端，所以子项目都加了`-client-`）
* `zookeeper-client-provider` 服务端
* `zookeeper-client-consumer` 服务的客户端

