package org.back0.redis;

import redis.clients.jedis.Jedis;

public class RedisBitmapsExample {
    public static void runExamples() {
        Jedis jedis = new Jedis("localhost", 6379);

        // Setting bits in a bitmap
        jedis.setbit("mybitmap", 0, true);
        jedis.setbit("mybitmap", 1, false);

        // Getting a bit value
        boolean bitValue = jedis.getbit("mybitmap", 0);
        System.out.println("Bit value at index 0: " + bitValue);

        // Counting set bits
        long bitsSet = jedis.bitcount("mybitmap");
        System.out.println("Number of bits set: " + bitsSet);

        // Cleanup
        jedis.del("mybitmap");
        jedis.close();
    }
}
