package com.company;

public class Book {
private int pages;
private int volumes;
private char editions;
private String favChapter;
private String hatedChapter;
private String printHouse;
private boolean hasCovers;

public void teachesYou(){
    System.out.println("social skills");
}
public void looksHeavy () {
    System.out.println("like it has 1000 pages.");
}
//atribute cu get
public String getFavChapter (){ return favChapter; }

public String getHatedChapter (){  return hatedChapter; }

public String getPrintHouse (){  return printHouse; }

public boolean gethasCovers() { return hasCovers; }

public char getEditions() { return editions; }

public int getPages() { return pages; }

public int getVolumes() { return volumes; }

//atribute cu set
public void setFavChapter (String favChapter){ //daca nu pun in (), va printa null cand e la obiect
    this.favChapter = favChapter;}

    public void setHatedChapter(String hatedChapter) {
        this.hatedChapter = hatedChapter;
    }

    public void setEditions(char editions) {
        this.editions = editions;
    }

    public void setHasCovers(boolean hasCovers) {
        this.hasCovers = hasCovers;
    }

    public void setPrintHouse(String printHouse) {
        this.printHouse = printHouse;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }
}