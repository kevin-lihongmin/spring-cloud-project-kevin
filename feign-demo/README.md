#### Feign demo

注意点：
> 1、Feign使用 ```@FeignClient``` 定义接口时, 使用```@RequestParam``` 定义参数，一定要加上```value```属性,否则会报错：
```java
nested exception is java.lang.IllegalStateException: RequestParam.value() was empty on parameter 0
```
