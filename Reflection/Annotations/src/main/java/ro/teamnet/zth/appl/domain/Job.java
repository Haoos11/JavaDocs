package ro.teamnet.zth.appl.domain;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;

/**
 * Created by Silviu.Marin on 12-Jul-17.
 */
@Table(name = "job")
public class Job {

    @Id(name = "job_id")
    private String id;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "min_salary")
    private float minSalary;

    @Column(name = "max_salary")
    private float maxSalary;

//
//    CREATE TABLE JOBS (
//            JOB_ID VARCHAR2(30) PRIMARY KEY,
//    JOB_TITLE VARCHAR2(35),
//    MIN_SALARY NUMBER,
//    MAX_SALARY NUMBER

}
