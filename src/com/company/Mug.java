package com.company;

public class Mug {
    private int capacity;
    private int addCapacity;
    private float height;
    private String usage;
    private String vibration;
    private boolean breakable;
    private char makesMyDay;

    public void expands() {
        System.out.println("It expands 2 cm. when exposed to heat.");
    }

    public void feeling() {
        System.out.println("It is tasty.");
    }

    public void changes() {
        System.out.println("It turns blue when you pour cold liquids into it.");
    }

    public void vibrates() {
        System.out.println("When left without water for 2h+.");
    }

    public String getUsage() {
        return usage;
    }
    public String getVibration() {
        return vibration;
    }
    public int getCapacity () {return capacity;}
    public boolean getBreakable() {
        return breakable;
    }
    public int getAddCapacity () {return addCapacity;}
    public char getMakesMyDay (){return makesMyDay;}
    public float getHeight (){return height;}

    public String setVibration() {
        return vibration;
    }

    public void setVibration(String vibration) {
        this.vibration = vibration;
    }

    public String setUsage;

    public void setUsage(String usage) {
        this.usage = usage;
    }
    // nu se pune get la int, double, float, ii pui doar return si completeaza automat ?

}