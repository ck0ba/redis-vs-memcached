package org.back0;

import org.back0.memcached.MemcachedExample;
import org.back0.redis.*;

public class Main {

    public static void main(String[] args) {
        // Initialize Redis examples
        RedisStringsExample.runExamples();
        RedisListsExample.runExamples();
        RedisSetsExample.runExamples();
        RedisHashesExample.runExamples();
        RedisSortedSetsExample.runExamples();
        RedisBitmapsExample.runExamples();
        RedisGeospatialExample.runExamples();
        RedisHyperLogLogsExample.runExamples();
        RedisStreamsExample.runExamples();

        // Initialize Memcached example
        MemcachedExample.runExamples();
    }
}
