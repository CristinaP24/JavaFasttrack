package com.company;

public class Intern extends Doctor {
    private boolean course;
    private String school;
    private String schedule;
    private float tips;
    private boolean lovesAnimals;
    private char hasBreaks;

    public void naps (){}
    public void studies (){}
    public void brushes (){}
    public void vaccinates () {}

    public boolean isCourse() {
        return course;
    }

    public void setCourse(boolean course) {
        this.course = course;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public float getTips() {
        return tips;
    }

    public void setTips(float tips) {
        this.tips = tips;
    }

    public boolean isLovesAnimals() {
        return lovesAnimals;
    }

    public void setLovesAnimals(boolean lovesAnimals) {
        this.lovesAnimals = lovesAnimals;
    }

    public char getHasBreaks() {
        return hasBreaks;
    }

    public void setHasBreaks(char hasBreaks) {
        this.hasBreaks = hasBreaks;
    }

    public void injects (){
        super.injects();
        System.out.println("Intern only injects cats.");
    }
    public void operates (){
        super.operates();
        System.out.println("Intern only operates dogs.");
    }
    public void teaches (){
        super.teaches();
        System.out.println("Intern only teaches himself.");
    }
    public void breeds (){
        super.breeds();
        System.out.println("Intern only breeds cats.");
    }


}
