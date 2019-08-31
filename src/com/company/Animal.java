package com.company;

public abstract class Animal {
    private String nume;
    private String culoare;
    private int varsta;
    private boolean par;
    private char sex;
    private boolean birthLivingBaby;
    private float goldenRatio;

    public void sleeps (){
    }
    public void eatsFood (){
    }

    public void plays (){
    }

    public float getGoldenRatio() {
        return goldenRatio;
    }

    public void setGoldenRatio(float goldenRatio) {
        this.goldenRatio = goldenRatio;
    }


    public boolean isPar() {
        return par;
    }

    public void setPar(boolean par) {
        this.par = par;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isBirthLivingBaby() {
        return birthLivingBaby;
    }

    public void setBirthLivingBaby(boolean birthLivingBaby) {
        this.birthLivingBaby = birthLivingBaby;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public abstract void sleep();
    public abstract void eat ();
    public abstract void run ();

}
