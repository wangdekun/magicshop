package com.friends.itour.service.impl;

import com.friends.itour.service.RedisService;
import com.friends.itour.util.SerializeUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

    @Service("redisService")
    public class RedisServiceImpl implements RedisService {

        @Resource
        private RedisTemplate<String, ?> redisTemplate;

        @Resource
        private Jedis jedis;

        @Override
        public boolean set(final String key, final String value) {
            boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
                @Override
                public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
                    RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                    connection.set(serializer.serialize(key), serializer.serialize(value));
                    return true;
                }
            });
            return result;
        }

        @Override
        public String get(final String key) {
            String result = redisTemplate.execute(new RedisCallback<String>() {
                @Override
                public String doInRedis(RedisConnection connection) throws DataAccessException {
                    RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                    byte[] value = connection.get(serializer.serialize(key));
                    return serializer.deserialize(value);
                }
            });
            return result;
        }

        @Override
        public boolean expire(final String key, long expire) {
            return redisTemplate.expire(key, expire, TimeUnit.SECONDS);
        }

        @Override
        public boolean remove(final String key) {
            boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
                @Override
                public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
                    RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                    connection.del(key.getBytes());
                    return true;
                }
            });
            return result;
        }

        @Override
        public String set(String key,Object object)
        {
            jedis.select(3);
            return jedis.set(key.getBytes(), SerializeUtil.serialize(object));
        }

        @Override
        public Object get(String key,boolean b) {
            byte[] value = jedis.get(key.getBytes());
            return SerializeUtil. unserialize(value);
        }

        @Override
        public void sortAdd(){
            jedis.select(5);
            for(Integer i=1000;i<1100;i++){
                System.out.println(i);
                jedis.zadd("mysort",Math.random(),i.toString());
            }

            Map<String,Double> map = new HashMap<>();
            map.put("mutouliu",5.0);
            jedis.zadd("mysort", map);
           /* //正序排列
            Set<String> mysort = jedis.zrange("mysort",0,-1);
            Stem.out.println(mysort);
            //倒序排列
            Set<String>mysort1 = jedis.zrange("mysort",-1,0);
            System.out.println(mysort1);*/
        }




    }
