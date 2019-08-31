package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class OperatiiLogice {
    public int checkHighestNumber(int first, int second) { //if-else if verifica2  conditii chiar daca nu exista si va da eroare, atunci pune un else general sau un return statement
        if (first > second) {
            return first;
        } else {
            return second;
        }

    }

    public String checkFastText(String textFromUser) { //scriu doar in clasa operatii logice, adica "rezolvarea"
        if (textFromUser.equals("FastTrack")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more"; //return pune val intr-o var, nu o printeaza, continutul e pus in Me
        }
        // Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number


    } //main e apelarea

    public int checkMiddleNumber(int numeroUno, int numeroDos, int numeroTres) {
        if ((numeroUno >= numeroDos) && (numeroUno <= numeroTres)) {
            System.out.println(numeroDos);
        }
        return numeroDos;
    }

    //Write a Java program to determine whether an input number is an even number
    // Void - executa cod, nu returneaza nimic - ex. cand am un text cu care nu mai fac nimic dupa, pot pune return si nimic in void ca sa ies mai repede
    public int checkNoFromUser(int noFromUser) {//scriu doar in clasa operatii logice, adica "rezolvarea"


        if (noFromUser % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        return noFromUser;
    }

    //Given a number input, if it is higher than 8 OR equal to 6, print “The amount of snow this winter was(cm):” and the given number. Else print “The forecast snow is(cm):”

    public void verifyWhether(int noUserSnow) {

        if ((noUserSnow == 6) || (noUserSnow > 8)) {
            System.out.println("The amount of snow this winter was " + noUserSnow + "cm");
        } else {
            System.out.println("The forecast snow is " + noUserSnow + "cm");
        }
    }

    //Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old
    public void enterAge(int ageVoting) {
        if (ageVoting >= 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You cannot vote");
        }
    }

    //If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed, otherwise, program will show "Not allowed”. (use a switch case for this)
    public void pressKey09(String whatKeyPress) {
        switch (whatKeyPress) {
            case "0":
                System.out.println("0");
                break;
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("3");
                break;
            case "4":
                System.out.println("4");
                break;
            case "5":
                System.out.println("5");
                break;
            case "6":
                System.out.println("6");
                break;
            case "7":
                System.out.println("7");
                break;
            case "8":
                System.out.println("8");
                break;
            case "9":
                System.out.println("9");
                break;
            default:
                System.out.println("Not allowed.");

        }
    }

    // Find the greatest number from 3 given numbers
    public void checkHighestNumber(int great1, int great2, int great3) {

        if (great1 > great2 && great1 > great3)
            System.out.println("Great1 is the greatest");
        else if (great2 > great1 && great2 > great3)
            System.out.println("Great2 is the greatest");
        else if (great3 > great1 && great3 > great2)
            System.out.println("Great3 is the greatest");
        else {
            System.out.println("Enter different no.");
        }
    }

    //▸ Given a number input, if the number is greater than 3 but not equal to 4, print “The number is greater than 3 and not equal to 4”. Else if the number is equal to 4 print ”The number is equal to 4”. Else if the number is lower than 3 print “The number is lower than3”
    public void checkFloatNo(float noFloat) {
        if (noFloat > 3 && noFloat != 4)
            System.out.println("The number is greater than 3 and not equal to 4");
        else if (noFloat == 4)
            System.out.println("The number is equal to 4");
        else if (noFloat < 3)
            System.out.println("The number is lower than 3");
    }
    //return - in afara metodei, cu void

    // Given a text input and a number input, if the text is equal to “FastTrack” AND the
    //number is equal to or lower than 3, print the text and the number. If the text is not
    //“FastTrack” AND the number is equal to or higher than 4, print the number and the text,
    //in this order.
//aici scriu ce face metoda, stiind ca are parametrul primit
    public void printTxtNo(String txt, Integer nr) {
        if (txt.equals("FastTrack") && nr <= 3)
            System.out.println("FastTrack " + nr);
        else if (txt != "FastTrack" && nr >= 4)
            System.out.println(nr + txt);

    }

    public void printToHundred(int number) { //am facut om metoda din cea din main, return te scoate din met
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //Given a number, while the number is equal to or lower than 100, print the number;
    public void printToHundredWhile(int number) { //aici o fac iar metoda
        while (number <= 100) {
            System.out.println(number);
            number++; //fara incrementare e infinite l
        }
    }

    //Write a java program to count backwards from a given number to a lower given number
    public void countReverse(int elNumero) {
        for (int i = elNumero; i >= 1; i--) {
            System.out.println(i);
            //fara incrementare e infinite loop
        }


//Write a Java program by using two for loops to produce the output shown below:
//*******
//******
//*****
//****
//***
//**
//*
    }

    public void starExercise() {
        for (int i = 7; i >= 1; i--) {
            System.out.print("*");
        }
    }

    //Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average.
    public void sumAndAverage() {
        int xa = 100;
        int sum = 0;
        for (int i = 0; i <= xa; i++) {
            sum = sum + i;

        }
        // to do
    }

    // Write a program to sum only the odd numbers from 1 to 100, and compute the average.
    public void sum2OddNo() {
        double iOdd = 0;
        int sum2 = 0;
        for (double nom = 1; nom <= 100; ++nom) {
            sum2 += nom;
            iOdd++;
        }

        System.out.println(sum2 / iOdd); //average
    }


// Modify the program to sum from 111 to 8899, and compute the average. Introduce an int variable called count to count the numbers in the specified range.

    public int sum3() { //as putea pune in parametru si sum ar fi egala cu parametrul

        int number1 = 111;
        int number2 = 8899;
        int sum3 = 0;

        for (int i = number1; i <= number2; i++) {

            sum3 = sum3 + i;
        }
        return sum3;
    }

    public double avg() {
        int number1 = 111;
        int number2 = 8899;
        int sum3 = 0;
        int counter = 0;

        for (int i = number1; i <= number2; i++) {

            sum3 = sum3 + i;
            counter++;

        }

        double avg = sum3 / (double) counter;

        return avg;
    }
    //Write the program do display the first 20 Fibonacci numbers

    public String fibonacciEx() {

        int counting = 20, numerUn = 0, numerDo = 1;
        String First20FibonacciNumbers = "";

        for (int i = 1; i <= counting; i++) {

            int sumOfPrevTwo = numerUn + numerDo;
            numerUn = numerDo; // devin nr 2
            numerDo = sumOfPrevTwo; //nr 2 devine suma

            First20FibonacciNumbers = First20FibonacciNumbers + sumOfPrevTwo + ",";
        }

        return First20FibonacciNumbers;

    }

    //Fibbonci var 2


    // Write a program to sum those numbers from 1 to 100 that is divisible by 7, and compute the average.
    public double avgNoDiv7() {
        double sum7 = 0;
        double counter = 0;
        for (int nuum = 1; nuum <= 100; nuum++) {
            if (nuum % 7 == 0) {
                sum7 = sum7 + nuum;
                counter++;
            }
        }
        return sum7 / counter;
    }
    // Modify DO WHILE loops 1. Given a number, while the number is equal to or lower than 100, print the number;

    public void printToHundredDoWhile() {
        int numbo = 100;
        do {
            System.out.println(numbo);
            numbo--;
        } while (numbo > 50);
    }


    // Modify DO WHILE loops 4. Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. compute and display the average.
    public int averageDoWhile() {

        int i = 1;
        int sumDow = 0;
        do {
            sumDow += i;
            i++;

        } while (i <= 100);
        return sumDow / 100;
    }

    //Array exercises
    //Array ex1. Def and write the values of array indeces so that value sof array start from 1 and count to 100, Print in console.

    public int[] setArrayHundred() {
        int[] myArray = new int[100];
        for (int i = 1; i <= 100; i++) {
            myArray[i - 1] = i; //
            //System.out.println(myArray[i - 1]);
        }
        return myArray;
    }

    //Array ex2. Write Java program to calculate the average value of array elements.
    public float getArrayAverage(int[] array) {
        int sum = 0;
        float average = 0f;
        for (int i = 1; i <= array.length; i++) {
            sum += array[i - 1];
        }
        System.out.println(sum);
        average = sum / (float) array.length;
        System.out.println(average);
        return average;
    }
    // Array ex3 - Write a Java program to test if an array contains a specific value.
    //with For Each

    public boolean contains(int[] arr, int num) {
        int[] miArray = {5, 2, 17, 13, 12, 19, 7, 3, 9, 15};

        for (int x : arr) {
            if (num == x) {
                return true;
            }
        }
        return false;
    }
    // Array Ex4. Write a Java program to find the index of an array element.
//a.Streams

    // int[] numStreams = {13, 14, 15, 16, 17, 18, 19, 20, 21};

    //public int ex4Array(int[] array) {
    //int[] ex4Array = {3, 8, 9, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32};

    // for (int p = 0; p < ex4Array.length; p++) {
    //   if (ex4Array[p] == 20) {
    //    System.out.println(p);
    //   break;
    // }
    //  System.out.println(p);
    // }
    // return p

    // Array Ex4. Write a Java program to find the index of an array element.

    public int find(int[] array, int value) {
        int[] arrayEx4 = {30, 31, 32, 33, 34, 35, 40, 42, 45, 50};

        for (int i = 0; i < array.length; i++)
            if (array[i] == value)
                return i;
        return value;
    }

    // Array Ex5. Write a Java program to remove a specific element from an array.

    public int getRemoveElement(int[] elArray) {

        // Remove the fourth element (index->3, value->14) of the array
        int removeIndex = 1;

        for (int i = removeIndex; i < elArray.length - 3; i++) {
            elArray[i] = elArray[i + 3];
        }
        return elArray.length;
    }


    //Array Lists
//1. Given a list of numbers, check which one is the highest and print it
    public int getHighestNumber(List<Integer> myList) {
        int max = myList.get(0);
        for (int i : myList) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    //2. Given a list of numbers, determine all of the even numbers
    public List evenNumbersFromList(List<Integer> myList) {
        List<Integer> secondList = new ArrayList();
        for (int i : myList) {
            if (i % 2 == 0) {
                secondList.add(i);
            }
        }
        return secondList;
    }
    //3.Write a Java program to iterate through all elements in a loop starting at the specified position


    public String[] arrBeverages() {

        String[] arrBeverages = {"latte", "chai", "cappuccino", "espresso", "milkshake"};
        for (int i = 0; i < arrBeverages.length; i++) {
            //
            if (i > 2) {
                System.out.println("Sorted beverages from position 2 are: " + arrBeverages[i]); //nu pot pune System.out in Main din cauza [i]
            }
        }
        return arrBeverages;
    }

    //4. Write a Java program to sort an array or a list
    //a.Int Array with Array.sort

    public int[] arrSortEx() {

        int[] arrSort = {23, 1556, 57, 5000, 101, 325, 229, 5033};
        Arrays.sort(arrSort);
        for (int i = 0; i < arrSort.length; i++) {
            System.out.println(arrSort[i]);
            //return arrSort.length;
        }
        return arrSort;
    }
    Calculator calculator = new Calculator();
    public void adunare2 () {
        System.out.println(calculator.adunare(2, 3));

    }
    //ca sa chem o metoda dintr-o clasa in alta clasa, ii fac un obiect in clasa in care vreau (Calculator calculator...)
    //2.ii fac o metoda (public...)
    //3.o apelez (calculator.adunare
    //4. introduc parametrii pe care deja i-am setat in metoda in clasa ei, (2, 3)
    //5. daca metoda nu e cu void in clasa ei, va returna ceva (e un public int)

}






















































