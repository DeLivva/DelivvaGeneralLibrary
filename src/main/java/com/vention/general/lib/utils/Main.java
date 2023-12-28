package com.vention.general.lib.utils;

public class Main {
    public static void main(String[] args) {
        GeoUtils geoUtils = new GeoUtils();

        System.out.println(geoUtils.calculateDistanceInKm(41.302776, 69.234995, 41.294533, 69.225213));
    }
}
