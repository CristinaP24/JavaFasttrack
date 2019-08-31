package com.company;

public class Doctor extends Employee {

private boolean female;
private String family;
private int studyYears;
private int homeStudyYears = 2;
private int practiceYears = 3;
private int operationsMade;
private int operationsPlanned;
private float hoursReads;

public void injects (){}
public void operates (){}
public void teaches (){}
public void breeds (){}

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int totalStudyYears() {
        studyYears =(practiceYears + homeStudyYears);
        return studyYears;
    }

    public void setHomeStudyYears(int homeStudyYears) {
        this.homeStudyYears = homeStudyYears;
    }

    public void setStudyYears(int studyYears) {
        this.studyYears = studyYears;
    }

    public int getPracticeYears() {
        return practiceYears;
    }

    public void setPracticeYears(int practiceYears) {
        this.practiceYears = practiceYears;
    }

    public int getOperationsMade() {
        return operationsMade;
    }

    public void setOperationsMade(int operationsMade) {
        this.operationsMade = operationsMade;
    }

    public int getOperationsPlanned() {
        return operationsPlanned;
    }

    public void setOperationsPlanned(int operationsPlanned) {
        this.operationsPlanned = operationsPlanned;
    }

    public float getHoursReads() {
        return hoursReads;
    }

    public void setHoursReads(float hoursReads) {
        this.hoursReads = hoursReads;
    }

    @Override
    public void paysTaxes() {
        super.paysTaxes();
        System.out.println("Doctor pays taxes 3 times a year.");
    }
    public void requiresSallaryIncrement (){
    super.requiresSallaryIncrement();
        System.out.println("Doctor requires sallary increment every 6 mts.");;
    }
    public void requiresGymMembership (){
    super.requiresGymMembership();
        System.out.println("Doctor requires gym membership once a year.");
    }
    public void checksInOut (){
    super.checksInOut();
        System.out.println("Doctor checks in at the end of worktime.");
    }


}
