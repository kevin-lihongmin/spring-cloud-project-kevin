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


#### `zuul-demo` Netflex Zuul实现的Api网关服务

#### `gateway-demo` Spring Cloud Gateway实现的Api网关服务

#### `spring-cloud-zookeeper-demo` Zookeeper注册中心（服务的提供端和调用端相对于Zookeeper都它的是客户端，所以子项目都加了`-client-`）
* `zookeeper-client-provider` 服务端
* `zookeeper-client-consumer` 服务的客户端

#### `consul-demo` Feign实现服务的调用
* `consul-provider` 服务提供者将服务注册到Consul集群中心
* `consul-consumer` 服务调用客户端，将服务注册到Consul集群中心
* `consul-config` 从Consul集群配置中心，获取配置信息

#### `spring-cloud-config` Spring Cloud Config配置服务器
* `config-client` 配置客户端
* `config-server-file` 文件-配置服务端
* `config-server-github` 远程git（github、gitlab等）-配置服务端
* `config-server-mysql` mysql数据库-配置服务端


