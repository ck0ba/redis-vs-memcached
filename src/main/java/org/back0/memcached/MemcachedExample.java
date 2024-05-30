package org.back0.memcached;

import net.spy.memcached.MemcachedClient;

import java.net.InetSocketAddress;
import java.util.concurrent.Future;

public class MemcachedExample {
    public static void runExamples() {
        try {
            // Connecting to Memcached server on localhost
            MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("localhost", 11211));

            // Setting a value in Memcached
            Future<Boolean> fo = mcc.set("key", 900, "ExampleValue");

            // Getting a value from Memcached
            System.out.println("Value of 'key': " + mcc.get("key"));

            // Deleting a value from Memcached
            mcc.delete("key");

            // Shutdown the client
            mcc.shutdown();
        } catch (Exception e) {
            System.err.println("Error connecting or operating on Memcached: " + e.getMessage());
        }
    }
}
