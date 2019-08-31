package com.company;

public class Dog extends Animal{ //click dr, refactor, rename - ca sa schimb numele clasei, e mereu cu Upper Case, numele Met si Atr cu Lower
    private int varsta;
    private String culoare; //le las goale ca sa pot sa fac obiecte cu template-urile astea
    private String nume;  //atribute private mereu
    private boolean alive;
    private char sex;
    private String blana; //trebuie pusa metida de set mereu ca sa pot apela ceva, altfel apelez ceva ce nu exista

    public void latra() { //metode publice mereu
        System.out.println("Ham!");
    }

    public void eat() {
        System.out.println("He eats its veggies");
    }

    @Override
    public void run() {

    }
    @Override
    public void sleep() {

    }

    public void runs() {
        System.out.println("Big dog runs to keep muscles.");
    }

    public String getNume() {
        return nume;
    }

    public String getCuloare() {
       return culoare;
    }



    public String getBlana(){
        return blana;
    }


    public String setBlana(){
        return blana;
    }
public void setBlana(String blana){
        this.blana = blana;


}
}
