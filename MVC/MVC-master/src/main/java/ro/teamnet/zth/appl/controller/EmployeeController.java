package ro.teamnet.zth.appl.controller;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;

/**
 * Created by Silviu.Marin on 20-Jul-17.
 */
@MyController(urlPath = "/employees")
public class EmployeeController {
    private String allEmployee = "allEmployees";
    private String oneEmployee = "oneRandomEmployees";

    @MyRequestMethod(methodType = "GET", urlPath = "/all")
    public String getAllEmployees(){
        return allEmployee;
    }

    @MyRequestMethod(methodType = "GET", urlPath = "/one")
    public String getOneEmployee(){
        return oneEmployee;
    }


}
