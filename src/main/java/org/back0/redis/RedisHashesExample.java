package org.back0.redis;

import redis.clients.jedis.Jedis;

import java.util.Map;

public class RedisHashesExample {
    public static void runExamples() {
        Jedis jedis = new Jedis("localhost", 6379);

        // Setting key-value pairs in a hash
        jedis.hset("myhash", "field1", "value1");
        jedis.hset("myhash", "field2", "value2");

        // Retrieving a value from a hash
        String value = jedis.hget("myhash", "field1");
        System.out.println("Value of 'field1': " + value);

        // Getting all keys and values from a hash
        Map<String, String> fields = jedis.hgetAll("myhash");
        System.out.println("Fields in hash: " + fields);

        // Deleting a field from a hash
        jedis.hdel("myhash", "field1");

        // Cleanup
        jedis.del("myhash");
        jedis.close();
    }
}
