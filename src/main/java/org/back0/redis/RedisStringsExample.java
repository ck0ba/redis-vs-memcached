package org.back0.redis;

import redis.clients.jedis.Jedis;

public class RedisStringsExample {
    public static void runExamples() {
        Jedis jedis = new Jedis("localhost", 6379);

        // Setting a string
        jedis.set("key", "value");

        // Getting a string
        String value = jedis.get("key");
        System.out.println("Retrieved string: " + value);

        // Cleanup
        jedis.del("key");
        jedis.close();
    }
}
