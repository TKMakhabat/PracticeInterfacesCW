package com.makhabatusen.transport;

public class PublicTransport implements Transport {
    @Override
    public void drivesTo(String destination) {
        System.out.printf("\nDrives to %s", destination);
    }
}
