package com.company;

public class Hawk extends Animal {public void haunts (){}


    public void flies (){}
private boolean laysEggs;    private int wingAmplitude;

    private char eatsMice;
    private String nails;

    public boolean isLaysEggs() {
        return laysEggs;
    }

    public void setLaysEggs(boolean laysEggs) {
        this.laysEggs = laysEggs; }

    public char getEatsMice() {
        return eatsMice;
    }

    public void setEatsMice(char eatsMice) {
        this.eatsMice = eatsMice;
    }

    public int getWingAmplitude() {
        return wingAmplitude;
    }

    public void setWingAmplitude(int wingAmplitude) {
        this.wingAmplitude = wingAmplitude;
    }

    public String getNails() {
        return nails;
    }

    public void setNails(String nails) {
        this.nails = nails;
    }

    public void sleeps (){
        super.sleeps();
        System.out.println("Hawk sleeps every day unlike other animals.");
    }
    public void eatsFood (){
        super.eatsFood();
        System.out.println("Hawk eats mice unlike other animals");
    }

    public void plays (){
        super.plays();
        System.out.println("Hawk plays with food unlike animals.");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void run() {

    }


}
