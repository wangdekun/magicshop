package com.friends.itour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ItourApplication {
	private Jedis jedis;
	private JedisPoolConfig config;
	private JedisShardInfo sharInfo;

	public static void main(String[] args) {
		SpringApplication.run(ItourApplication.class, args);
	}

	@Bean
	public Jedis jedis(){
	//连接redis服务器，192.168.0.100:6379
	// jedis = new Jedis("192.168.0.100", 6379);
	// //权限认证
	// jedis.auth("123456");
	// 操作单独的文本串
		config = new JedisPoolConfig();
		config.setMaxIdle(1000);//最大空闲时间
		config.setMaxWaitMillis(1000); //最大等待时间
		config.setMaxTotal(500); //redis池中最大对象个数
		sharInfo = new JedisShardInfo("94.191.33.118", 6379);
		sharInfo.setPassword("123456");
		sharInfo.setConnectionTimeout(5000);//链接超时时间
		jedis = new Jedis(sharInfo);
		return jedis;
	}
}
