package org.back0.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.StreamEntryID;
import redis.clients.jedis.resps.StreamEntry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RedisStreamsExample {
    public static void runExamples() {
        Jedis jedis = new Jedis("localhost", 6379);

        // Adding messages to a stream
        StreamEntryID entryID = jedis.xadd("mystream", StreamEntryID.NEW_ENTRY,
                Map.of("key1", "value1", "key2", "value2"));
        System.out.println("Added entry: " + entryID);

//        // Reading messages from a stream
//        Map<String, StreamEntryID> streamQuery = new HashMap<>();
//        streamQuery.put("mystream", StreamEntryID.UNRECEIVED_ENTRY);
//        List<Map.Entry<String, List<StreamEntry>>> entries = jedis.xread(1, 0, streamQuery);
//        System.out.println("Stream entries: " + entries);

        // Cleanup
        jedis.del("mystream");
        jedis.close();
    }
}
