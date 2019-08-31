package com.company;

import java.util.*;

public class Citire {

    public List<Integer> getListFromUser() {
        List<Integer> myList = new ArrayList();
        System.out.print("Enter how many elements: ");
        int size = getNumberfromKy();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number");
            myList.add(getNumberfromKy());
            //aici poate userul nu pune un nr si se poate da o eroare
        }
        return myList;
    }

        public int getNumberfromKy () { //de facut pt fiecare metoda la care vreau sa prind exceptia
            boolean repeat = true;
            int number = 0;
            while (repeat) {

            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a number");
                number = scan.nextInt();
                repeat = false; //nu intra in catch cand citeste un nr.
            } catch (InputMismatchException e) {
                System.err.println("Error: Invalid character!");
            }
        }
        return number;

    }

    //Metode pt float, double
    public float getFloatfromKy(){
        boolean repeatF = true;
        float numberF = 0;
        while (repeatF) {

            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a float");
                numberF = scan.nextFloat();
                repeatF = false;
            } catch (InputMismatchException e) {
                System.err.println("Error, Invalid character. Enter float.");
            }
        }
        return numberF;
    }



}



