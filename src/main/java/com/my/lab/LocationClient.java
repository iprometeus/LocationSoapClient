package com.epam.lab;


import com.epam.lab.domain.PlaceType;
import com.epam.lab.webservice.LocationService;
import com.epam.lab.webservice.impl.LocationServiceImplService;
import com.epam.lab.wrapper.Response;

import javax.jws.WebService;

@WebService
public class LocationClient {
    private static LocationServiceImplService locationServiceImpl;

    public static void main(String[] args) {
        locationServiceImpl = new LocationServiceImplService();
        LocationService locationServicePort = locationServiceImpl.getLocationServiceImplPort();
        Response response;

        response = locationServicePort.findFriendsByPlace("Madlenn");
        response.getUserOrPlace().stream().forEach(System.out::println);

        response = locationServicePort.findFriendsByCoordinates(5, 5);
        response.getUserOrPlace().stream().forEach(System.out::println);

        PlaceType placeType = new PlaceType();
        placeType.setId(5);
        placeType.setName("bar");
        response = locationServicePort.addPlace("Test", placeType, 49.345846, 23.543687);
        System.out.println(response.getPlace().toString());

        response = locationServicePort.findNearPlacesByDistance(5, 5, 100000000);
        response.getUserOrPlace().stream().forEach(System.out::println);

        response = locationServicePort.checkin(2, 2);
        System.out.println(response.getUser().toString());
    }
}