package com.company;

public class Employee {
    private double salary;
    private boolean hasDegree;
    private boolean hasFreeTime;
    private boolean foodTickets;
    private char hasGender;
    private String hasDuties;
    private String experience;


    public void paysTaxes(){
        System.out.println("Employee pays twice a year");
    }
    public void requiresSallaryIncrement (){
        System.out.println("Employee requires big sallary.");
    }
    public void requiresGymMembership (){
        System.out.println("Employee requires bi-anual Gym Membership");
    }
    public void checksInOut (){
        System.out.println("Employee check in and out just once in a while");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isHasDegree() {
        return hasDegree;
    }

    public void setHasDegree(boolean hasDegree) {
        this.hasDegree = hasDegree;
    }

    public boolean isHasFreeTime() {
        return hasFreeTime;
    }

    public void setHasFreeTime(boolean hasFreeTime) {
        this.hasFreeTime = hasFreeTime;
    }

    public boolean isFoodTickets() {
        return foodTickets;
    }

    public boolean setFoodTickets(boolean foodTickets) {
        this.foodTickets = foodTickets;
        return foodTickets;
    }

    public char getHasGender() {
        return hasGender;
    }

    public void setHasGender(char hasGender) {
        this.hasGender = hasGender;
    }

    public String getHasDuties() {
        return hasDuties;
    }

    public void setHasDuties(String hasDuties) {
        this.hasDuties = hasDuties;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
