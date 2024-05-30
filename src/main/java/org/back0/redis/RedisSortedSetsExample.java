package org.back0.redis;

import redis.clients.jedis.Jedis;

import java.util.List;

public class RedisSortedSetsExample {
    public static void runExamples() {
        Jedis jedis = new Jedis("localhost", 6379);

        // Adding elements to a sorted set with scores
        jedis.zadd("mysortedset", 1, "element1");
        jedis.zadd("mysortedset", 2, "element2");

        // Retrieving the score of an element
        Double score = jedis.zscore("mysortedset", "element1");
        System.out.println("Score of 'element1': " + score);

        // Retrieving all elements from a sorted set
        List<String> elements = jedis.zrange("mysortedset", 0, -1);
        System.out.println("Elements in sorted set: " + elements);

        // Removing elements from a sorted set
        jedis.zrem("mysortedset", "element1", "element2");

        // Cleanup
        jedis.del("mysortedset");
        jedis.close();
    }
}
