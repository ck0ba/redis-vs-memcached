package org.back0.redis;

import redis.clients.jedis.Jedis;

public class RedisHyperLogLogsExample {
    public static void runExamples() {
        Jedis jedis = new Jedis("localhost", 6379);

        // Adding elements to HyperLogLog
        jedis.pfadd("hll", "a", "b", "c", "d", "e", "f", "g");

        // Getting the approximate count of unique elements
        long count = jedis.pfcount("hll");
        System.out.println("Approximate count of unique elements: " + count);

        // Cleanup
        jedis.del("hll");
        jedis.close();
    }
}