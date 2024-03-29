package com.online.shopping.config.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@RefreshScope
@Configuration
@ConfigurationProperties(prefix= "redis")
public class RedisProperties {
	
	private String redisHost;
	
	private int redisPort;
	

}
