package com.dsm.xlsxparser;

import java.time.LocalDate;

public class Activity {

    private LocalDate date;
    private String schedule;
    private String secondFloorTeacherId;
    private String thirdFloorTeacherId;
    private String forthFloorTeacherId;

    public Activity() {}
    public Activity(LocalDate date, String schedule, String secondFloorTeacherId, String thirdFloorTeacherId, String forthFloorTeacherId) {
        this.date = date;
        this.schedule = schedule;
        this.secondFloorTeacherId = secondFloorTeacherId;
        this.thirdFloorTeacherId = thirdFloorTeacherId;
        this.forthFloorTeacherId = forthFloorTeacherId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSecondFloorTeacherId() {
        return secondFloorTeacherId;
    }

    public void setSecondFloorTeacherId(String secondFloorTeacherId) {
        this.secondFloorTeacherId = secondFloorTeacherId;
    }

    public String getThirdFloorTeacherId() {
        return thirdFloorTeacherId;
    }

    public void setThirdFloorTeacherId(String thirdFloorTeacherId) {
        this.thirdFloorTeacherId = thirdFloorTeacherId;
    }

    public String getForthFloorTeacherId() {
        return forthFloorTeacherId;
    }

    public void setForthFloorTeacherId(String forthFloorTeacherId) {
        this.forthFloorTeacherId = forthFloorTeacherId;
    }
}
