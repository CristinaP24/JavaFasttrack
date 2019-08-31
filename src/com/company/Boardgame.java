package com.company;

public class Boardgame {

    private int number;
    private int edition;
    private char extension;
    private String type;
    private String award;
    private boolean forChildren;

    //atribute cu get
    public String getAward (){ return award; }
    public String getType() { return type; }
    public int getEdition() { return edition; }
    public int getNumber() { return number; }
    public boolean getForChildren() { return forChildren; }
    public char getExtension() { return extension; }
    //atribute cu set

    public void setAward(String award) {  this.award = award; }
    public void setType(String type) {
        this.type = type;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
    public void setExtension(char extension) {
        this.extension = extension;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setForChildren(boolean forChildren) {
        this.forChildren = forChildren;
    }
}
