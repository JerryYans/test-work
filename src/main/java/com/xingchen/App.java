package com.xingchen;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


/**
 * Hello world!
 *
 */
public class App{
	
    public static void main(String[] args) {
		JedisPool jp = new JedisPool("127.0.0.1");
		Jedis j = jp.getResource();
		j.sadd("a", "aa");
	}
}
