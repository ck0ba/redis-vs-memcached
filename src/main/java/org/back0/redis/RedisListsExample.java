package org.back0.redis;

import redis.clients.jedis.Jedis;

public class RedisListsExample {
    public static void runExamples() {
        Jedis jedis = new Jedis("localhost", 6379);

        // Adding elements to a list
        jedis.lpush("mylist", "element1");
        jedis.rpush("mylist", "element2");

        // Retrieving elements from a list
        String element = jedis.lindex("mylist", 0);
        System.out.println("First element: " + element);

        // Removing elements from a list
        jedis.lpop("mylist");
        jedis.rpop("mylist");

        // Cleanup
        jedis.del("mylist");
        jedis.close();
    }
}
