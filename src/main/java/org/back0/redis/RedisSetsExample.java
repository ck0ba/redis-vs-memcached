package org.back0.redis;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class RedisSetsExample {
    public static void runExamples() {
        Jedis jedis = new Jedis("localhost", 6379);

        // Adding elements to a set
        jedis.sadd("myset", "element1", "element2");

        // Checking if a set contains a certain element
        boolean exists = jedis.sismember("myset", "element1");
        System.out.println("Set contains 'element1': " + exists);

        // Retrieving all elements from a set
        Set<String> elements = jedis.smembers("myset");
        System.out.println("Elements in set: " + elements);

        // Removing elements from a set
        jedis.srem("myset", "element1", "element2");

        // Cleanup
        jedis.del("myset");
        jedis.close();
    }
}
