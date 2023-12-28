package com.vention.general.lib.utils;

import org.springframework.stereotype.Component;

@Component
public class GeoUtils {

    public double calculateDistanceInKm(double lat1, double lon1, double lat2, double lon2) {
        return calculateDistance(lat1, lon2, lat2, lon2, 6371.0);
    }

    public double calculateDistanceInMiles(double lat1, double lon1, double lat2, double lon2) {
        return calculateDistance(lat1, lon2, lat2, lon2, 3956);
    }

    private double calculateDistance(double lat1, double lon1, double lat2, double lon2, double earthRadius) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        // Haversine formula
        double dLat = lat2 - lat1;
        double dLon = lon2 - lon1;

        double a = Math.pow(Math.sin(dLat / 2), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dLon / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // Calculate the distance
        return earthRadius * c;
    }
}
