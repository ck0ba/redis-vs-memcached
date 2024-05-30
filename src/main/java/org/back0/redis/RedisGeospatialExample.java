package org.back0.redis;


import redis.clients.jedis.GeoCoordinate;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.args.GeoUnit;

import java.util.List;

public class RedisGeospatialExample {
    public static void runExamples() {
        Jedis jedis = new Jedis("localhost", 6379);

        // Adding geospatial data
        jedis.geoadd("cities", 13.361389, 38.115556, "Palermo");
        jedis.geoadd("cities", 15.087269, 37.502669, "Catania");

        // Calculating distance between two points
        Double distance = jedis.geodist("cities", "Palermo", "Catania", GeoUnit.KM);
        System.out.println("Distance between Palermo and Catania: " + distance + " km");

        // Getting the position
        List<GeoCoordinate> coordinates = jedis.geopos("cities", "Palermo", "Catania");
        System.out.println("Coordinates: " + coordinates);

        // Cleanup
        jedis.del("cities");
        jedis.close();
    }
}

