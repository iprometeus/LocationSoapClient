package com.epam.lab;

import com.epam.lab.domain.PlaceType;
import com.epam.lab.webservice.LocationService;
import com.epam.lab.webservice.impl.LocationServiceImplService;
import com.epam.lab.wrapper.Response;
import com.epam.lab.wrapper.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class LocationServiceTest {

    private final static Logger LOG = LogManager.getLogger(LocationServiceTest.class);
    private LocationService locationServicePort;

    @BeforeClass
    public void beforeClass() {
        LOG.info("Location service setting up.");
        LocationServiceImplService locationServiceImpl = new LocationServiceImplService();
        locationServicePort = locationServiceImpl.getLocationServiceImplPort();
    }

    @Test
    public void testFindFriendsByPlace() {
        Response response = locationServicePort.findFriendsByPlace("Madlenn");
        Assert.assertEquals(response.getStatus(), Status.SUCCESS);
        Assert.assertEquals(response.getUsers().getUsers().size(), 2);
    }

    @Test
    public void testFindFriendsByCoordinates() {
        Response response = locationServicePort.findFriendsByCoordinates(5, 5);
        Assert.assertEquals(response.getStatus(), Status.SUCCESS);
        Assert.assertEquals(response.getUsers().getUsers().size(), 2);
    }

    @Test
    public void testAddPlace() {
        PlaceType placeType = new PlaceType();
        placeType.setId(5);
        placeType.setName("bar");
        Response response = locationServicePort.addPlace("Test", placeType, 49.345846, 23.543687);
        Assert.assertEquals(response.getStatus(), Status.SUCCESS);
        Assert.assertTrue(response.getPlace().getId() > 0);
        Assert.assertEquals(response.getPlace().getName(), "Test");
    }

    @Test
    public void testFindNearPlacesByDistance() {
        Response response = locationServicePort.findNearPlacesByDistance(5, 5, 1);
        Assert.assertEquals(response.getStatus(), Status.SUCCESS);
        Assert.assertEquals(response.getPlaces().getPlaces().size(), 1);
    }

    @Test
    public void testCheckin() {
        Response response = locationServicePort.checkin(1, 6);
        Assert.assertEquals(response.getStatus(), Status.SUCCESS);
        Assert.assertEquals(response.getUser().getId(), 1);
        Assert.assertEquals(response.getUser().getPlace().getId(), 6);
    }

    @AfterMethod
    public void afterMethod(ITestResult result, Method method) {
        if (result.getStatus() == ITestResult.FAILURE) {
            LOG.error(method + " has failed.\n");
        }
    }
}