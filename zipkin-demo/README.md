# spring-cloud-project-kevin
spring cloud sleuth 相关组件

1、服务调用关系为： sleuth-consumer 调用 sleuth-provider 调用 sleuth-provider-provider

2、服务都需要注册到 Eureka-Server的注册中心

3、服务都用默认http的方式上报到 http://localhost:9411 的单独的信息收集中心（Zipkin服务中心）

4、使用项目的ZipkinServer启动会报错，所以直接下载的zipkin-server-2.12.9-exec.jar ， 直接使用 java -jar 命令启动服务

5、项目的pom中 spring-cloud-sleuth-zipkin + spring-cloud-starter-sleuth 就相当于直接引入 spring-cloud-starter-zipkin。 由于忘了引入spring-cloud-sleuth-zipkin耽搁了好久


   

