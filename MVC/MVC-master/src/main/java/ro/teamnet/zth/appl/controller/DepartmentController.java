package ro.teamnet.zth.appl.controller;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;

/**
 * Created by Silviu.Marin on 20-Jul-17.
 */
@MyController(urlPath = "/departments")
public class DepartmentController {
    private String allDepartments = "allDepartments";
    private String oneDepartment = "oneDepartment";

    @MyRequestMethod(methodType = "GET", urlPath = "/all")
    public String getAllDepartments() {
        return allDepartments;
    }

    @MyRequestMethod(methodType = "GET", urlPath = "/one")
    public String getOneDepartment() {
        return oneDepartment;
    }
}
