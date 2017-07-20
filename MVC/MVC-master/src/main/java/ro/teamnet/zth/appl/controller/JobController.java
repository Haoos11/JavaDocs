package ro.teamnet.zth.appl.controller;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;

/**
 * Created by Silviu.Marin on 20-Jul-17.
 */
@MyController(urlPath = "/jobs")
public class JobController {
    private String alljobs = "allJobs";
    private String oneJob = "oneJob";

    @MyRequestMethod(methodType = "GET", urlPath = "/all")
    public String getAllJobs() {
        return alljobs;
    }

    @MyRequestMethod(methodType = "GET", urlPath = "/one")
    public String getOneJob() {
        return oneJob;
    }
}
