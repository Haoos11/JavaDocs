package ro.teamnet.zth.appl.controller;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;

/**
 * Created by Silviu.Marin on 20-Jul-17.
 */
@MyController(urlPath = "/locations")
public class LocationController {
    private String allLocations = "allLocations";
    private String oneLocation = "oneLocation";

    @MyRequestMethod(methodType = "GET", urlPath = "/all")
    public String getAllLocations() {
        return allLocations;
    }

    @MyRequestMethod(methodType = "GET", urlPath = "/one")
    public String getOneLocation() {
        return oneLocation;
    }
}
