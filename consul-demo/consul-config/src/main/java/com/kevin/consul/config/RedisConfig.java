package com.kevin.consul.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *  redis配置
 */
@ConfigurationProperties(prefix = "redis")
public class RedisConfig {
    /** redis ip地址 */
    private String ip;
    /** redis port */
    private String port;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "RedisConfig{" + "ip='" + ip + ", port='" + port + '}';
    }
}
