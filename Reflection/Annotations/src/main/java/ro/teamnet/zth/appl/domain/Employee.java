package ro.teamnet.zth.appl.domain;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;

import java.util.Date;

/**
 * Created by Silviu.Marin on 12-Jul-17.
 */

@Table(name = "employee")
public class Employee {

    @Id(name = "employee_id")
    private int employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "hire_date")
    private Date hireDate;

    @Column(name = "job_id")
    private String jobId;

    @Column(name = "salary")
    private long salary;

    @Column(name = "commission_pct")
    private float commissionPct;

    @Column(name = "manager_id")
    private int managerId;

    @Column(name = "department_id")
    private int departmentId;

//
//    EMPLOYEE_ID NUMBER PRIMARY KEY,
//    FIRST_NAME VARCHAR2(20),
//    LAST_NAME VARCHAR2(25) NOT NULL ,
//    EMAIL VARCHAR2(25) NOT NULL,
//    PHONE_NUMBER VARCHAR2(20),
//    HIRE_DATE DATE NOT NULL ,
//    JOB_ID VARCHAR2(30) NOT NULL ,
//    SALARY NUMBER(8,2),
//    COMMISSION_PCT NUMBER(2,2),
//    MANAGER_ID NUMBER,
//    DEPARTMENT_ID NUMBER

}
