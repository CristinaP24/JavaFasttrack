package com.company;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;


public class Main {
   // static int memberVariable = 3; //si var si metoda main sunt statice, e o variabila membru doar declarata, apoi ii dau val

    public static void main(String[] args) {

        //EX 1. Given 2 no see which one is the greatest and print it
// dupa ce fac sa mearga un algoritm in Main, trebuie sa il scot si il pun intr-o noua clasa

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Introdu primul numar: ");
//        int firstNumber = scan.nextInt(); //sa citim de la tastatura + tipul de data: int, char...
//        System.out.print("Introdu al doilea numar: "); //daca las ln, imi va conditiona in consola sa introduc pe linia 2
//        int secondNumber = scan.nextInt();

        OperatiiLogice op = new OperatiiLogice();
        Scanner scan = new Scanner(System.in);



//        System.out.println("The highest number is: " + op.checkHighestNumber(firstNumber, secondNumber));
//
//
//        //public void set op (OperatiiLogice){
//// EX2 Given a text input, if it is “FastTrack”, then print “Learning text comparison”. If not, print
////“Got to try some more” - ca sa comment mai multe linii, selectez si ctrl + /
//
//        System.out.print("Introdu text: "); //string nu se compara cu == si se compara cu string equals
//        String textFromUser = scan.next();
//        System.out.println(op.checkFastText(textFromUser)); //in main doar apelez
//
//        // EX3 Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number
//
//        System.out.println("Introdu numar Uno aici pt EX3: ");
//        int numeroUno = scan.nextInt(); //trebuie sa initializez intai valorile din Clasa Operatii logice
//
//        System.out.println("Introdu numar Dos aici pt EX3: ");
//        int numeroDos = scan.nextInt(); // folosim obiectul scan mereu ca sa preluam de la tastatura
//
//        System.out.println("Introdu numar Tres aici pt EX3; ");
//        int numeroTres = scan.nextInt();
//        //HW IF-ELSE-SWITCH starts here
//
//        // Write a Java program to determine whether an input number is an even number
//        System.out.println("Enter a number here.");
//        int noFromUser = scan.nextInt();
//        op.checkNoFromUser(noFromUser); //obiectul op din clasa operatii logice, instanta, cu . apelez metoda care asteapta un parametru (ce vine de la user)
//
//        // Given a number input, if it is higher than 8 OR equal to 6, print “The amount of snow this winter was(cm):” and the given number. Else print “The forecast snow is(cm):”
//        System.out.print("Enter no. for snow exercise: ");
//
//        int noUserSnow = scan.nextInt();
//        op.verifyWhether(noUserSnow);
//
//// nu poti concatena SOUT daca ai void
//        op.checkMiddleNumber(numeroUno, numeroDos, numeroTres);
//        //Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old
//        System.out.println("Enter your age here: ");
//        int ageVoting = scan.nextInt();
//        op.enterAge(ageVoting);
//// If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed, otherwise, program will show "Not allowed”. (use a switch case for this)
//// ca sa  !text equals ("text"!) pt ex 4
//
//
////        // tema C=5/9*(F-32) ints si F va fi o variabila t1
//////        System.out.println("Hello world!");
//////        int firstNumber = 3; //las spatiu intre operatori ca sa citesc mai usor, am declarat si initializat o var cu val 3, trebuie sa creez var inainte sa lucrez
//////        int secondNumber = 5;
//////        int thirdNumber = firstNumber + secondNumber;
//////        System.out.println(thirdNumber);
//////
//////        String myName = "Chris"; //string + int = concat, no+no = adunare
//////        System.out.println(myName + (firstNumber + thirdNumber)); // ca sa adun, separ cu paranteza, asa grupez instructiuni
//////        //mereu ma uit unde fac var. aici sunt var locale
//////        //Exercitii var-operatori cu pre-post incrementare t2
//////        //int x = 2;
//////        //x+=x+=x++ + ++x; //pre si post incrementare
//////        //x++ - la final, se citeste de la dr spre stanga si se executa de la stanga spre dreapta
//////        //++x - la inceput, e un pre-incrementor
//////        // ex1.
////////        int x = 12;
////////        int y = 13;
////////        int z = x - y;
////////        System.out.println(z);
////////
////////        float f = 100;
////////        float first = 5;
////////        float second = 9;
////////        float c = first / second * (f - 32);
////////        c = 5 / 9f * (f - 32);
//////        System.out.println("Rezultat =" + adunare(3, 4));
//////        System.out.println("Rezultat =" + myName()); //sout e o metoda si nu pot sa o pun in int. metodei, adica in acoladele metodei
//////        ; //metoda de adunare de la public static int adunare, pun parametrii la metoda ca sa ma lasa sa pun in metoda
//////// in int met se aduna primul nr cu al doilea - 2 int ca si parametrii in metoda adunare, parametrii iau valori, tip met si tip retur trebuie la fel
//////        System.out.println("Rezultat = " + (scadere(45, 22)));// aici nu fac operatii, doar concatenez
//////        System.out.println("Rezultat impartire = " + (impartire(16, 2))); //nu mai calculez impartirea in SOUT, deja stie  din semnul de la impartire, aici doar atribuie, nu calc
//////        System.out.println("Rezultat inmultire = " + inmultire(23, 2));
//////
//////        Dog lucky = new Dog(); //sa scriu in metoda main, nu in clasa main
//////        Dog laica = new Dog(); //asa fac un obiect cu template-ul Dog, care-i Clasa
//////        Dog rex = new Dog();
//////        Dog grivei = new Dog();
//////        lucky.setBlana("DA");
//////        laica.setBlana("DA");
//////        rex.setBlana("da");
//////        grivei.setBlana("da");
//////        System.out.println("pt lucky:" + lucky.getBlana());
////Tema obiect calculator de aici:
//        Calculator calc = new Calculator();
//        System.out.println("Rezultate =" + (calc.adunare(2, 5)));
//        System.out.println("Rezultate =" + (calc.scadere(34, 2))); //aici doar introduc o valoare, NU calculez in Print
//        System.out.println("Rezultate =" + (calc.impartire(8, 2)));
//        System.out.println("Rezultate =" + (calc.inmultire(3, 8)));
//        System.out.println("Rezultate modulo=" + (calc.modulo(10, 3)));
//        System.out.println("Rezultate putere=" + (calc.putere(2, 2))); //doar cu double ca data type
//        System.out.println("Rezultate putere cu cast=" + (calc.radical2(4, 4))); //Ridicare la putere cu Cast pe functie Math.pow
//        System.out.println("Rezultat radical=" + (calc.radical(64)));
////
//////        // Tema obiect Mug incepe de aici:
//////        Mug coffee = new Mug();
//////        Mug pudding = new Mug();
//////        Mug snacks = new Mug();
//////
//////        coffee.setUsage("Yeah, for magic liquid.");
//////        pudding.setUsage("Yeah, for dessert.");
//////        snacks.setUsage("Yeah, for crunchy ones.");
//////        coffee.setVibration("so not to burn tongue");
//////        coffee.getBreakable(); //nu e nevoie sa aduc iar obiectul din Clasa lui aici
//////
//////        System.out.println(coffee.getUsage());
//////        System.out.println(pudding.getUsage());
//////        System.out.println(snacks.getUsage());
//////        System.out.println("When coffee is too hot, the mug vibrates " + coffee.getVibration());
//////        System.out.println("A mug is made of steel? " + coffee.getBreakable());
//////        System.out.println("OK " + coffee.getUsage());
//////
//////        //mai am de facut operatii in clasa mug, nu aici
//////
//////        // Tema obiect Mug se incheie aici.
//////        // Tema obiect Book incepe aici.
//////        Book psychology = new Book();
//////        Book history = new Book();
//////        Book economy = new Book();
//////        Book sciFi = new Book();
//////
//////        psychology.setHatedChapter("Humanism.");
//////        history.setHatedChapter("Second WW");
//////        economy.setHatedChapter("Modern economy");
//////        sciFi.setHatedChapter("Grotesque tales");
//////
//////        psychology.setFavChapter("Behaviourism");
//////        history.setFavChapter("Medieval Times");
//////        economy.setFavChapter("Golden Age Economy");
//////        sciFi.setFavChapter("Invisibiilty Cloak");
//////
//////        psychology.setEditions('y');
//////        history.setEditions('n');
//////        economy.setEditions('o');
//////        sciFi.setEditions('m');
//////
//////        System.out.println("My least fav chapter in psychology is " + psychology.getHatedChapter());
//////        System.out.println("My fav chapter in psychology is " + psychology.getFavChapter());
//////        System.out.println("My least fav chapter in history is " + history.getHatedChapter());
//////        System.out.println("My fav chapter in history is " + history.getHatedChapter());
//////        System.out.println("My least fav chapter in economy is " + economy.getHatedChapter());
//////        System.out.println("My fav chapter in economy is " + economy.getFavChapter());
//////        System.out.println("My least fav chapter in sci-fi is " + sciFi.getHatedChapter());
//////        System.out.println("My fav chapter in sci-fi is " + sciFi.getFavChapter());
//////
//////
//////        // Tema obiect Book se incheie aici.
//////        // Tema obiect Boardgame incepe de aici.
//////        Boardgame kingdoms = new Boardgame();
//////        Boardgame starRealms = new Boardgame();
//////        Boardgame dixit = new Boardgame();
//////
//////        kingdoms.setAward("it is the first BG of year in 2010.");
//////        starRealms.setAward("it is 3rd BG of year in 2010.");
//////        dixit.setAward("it is 2nd BG of year in 2010.");
//////
//////        kingdoms.setEdition(2);
//////        starRealms.setEdition(3);
//////        dixit.setEdition(4);
//////
//////        kingdoms.setExtension('a');
//////        starRealms.setExtension('b');
//////        dixit.setExtension('c');
//////
//////        kingdoms.setNumber(11);
//////        starRealms.setNumber(12);
//////        dixit.setNumber(13);
//////
//////        kingdoms.setForChildren(true);
//////        starRealms.setForChildren(false);
//////        dixit.setForChildren(true);
//////
//////        kingdoms.setType("strategy");
//////        starRealms.setType("competition");
//////        dixit.setType("family");
//////
//////        System.out.println("It is great that " + kingdoms.getAward());
//////        System.out.println("I don't agree that " + starRealms.getAward());
//////        System.out.println("It is not fair that " + dixit.getAward());
//////
//////        System.out.println("My fav edition from Kingdoms is no " + kingdoms.getEdition());
//////        System.out.println("Most boring edition from Star Realms is no " + starRealms.getEdition());
//////        System.out.println("Dixit edition that is mostly preferred is no " + dixit.getEdition());
//////
//////        System.out.println("Give me the following Kingdom extension: " + kingdoms.getExtension());
//////        System.out.println("It is boring the Star Realms extension named " + starRealms.getExtension());
//////        System.out.println("Here's my fav Dixit extension: " + dixit.getExtension());
//////
//////        System.out.println("Kingdom's winning times: " + kingdoms.getNumber());
//////        System.out.println("Realm's winning times: " + starRealms.getNumber());
//////        System.out.println("Dixit's winning times: " + dixit.getNumber());
//////
//////        System.out.println("Kingdoms is good for " + kingdoms.getType());
//////        System.out.println("Star Realms is a game for " + starRealms.getType());
//////        System.out.println("Dixit is a game for " + dixit.getType());
//////
//////    }
//////
//////
//////    //Tema obiect Boardgame se incheie aici.
//////
//////
//////    public static int adunare(int primul, int aldoilea) {
//////        int result = primul + aldoilea;
//////        return result;
//////    }
//////
//////    public static String myName() {
//////        return "Maria";
//////    }
//////
//////    public static float scadere(float valoareaPrima, float valoareaDoi) {
//////        return valoareaPrima - valoareaDoi;
//////    }
//////
//////    public static int impartire(int valUnu, int valDoi) {
//////        return valUnu / valDoi;
//////    }
//////
//////    public static int inmultire(int numarPrim, int numarSecund) {
//////        return numarPrim * numarSecund;
//////    }
//////
//////    public static int modulo(int numarA, int numarB) {
//////        return numarA % numarB;
//////    }
//////
//////    public static int putere(int numarX, int numarY) {
//////        return numarX ^ numarY;
//////    }
//////
//////    public static double radical(double numarC) {
//////        return numarC;
//////    }
//////
//////
////
//        //// If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed, otherwise, program will show "Not allowed”. (use a switch case for this)
//        System.out.println("Enter a key here: ");
//        String whatKeyPressed = scan.next();
//        //aici introduce no 0-9 fara sa i de afiseze cerinta aceasta, deci fac de la tastatura
//
//        op.pressKey09(whatKeyPressed);
//
//        //Find the greatest number from 3 given numbers
//
//        int great1, great2, great3;
//        System.out.println("Enter 3 no. to get the greatest of them ");
//
//        great1 = scan.nextInt();
//        great2 = scan.nextInt();
//        great3 = scan.nextInt();
//        op.checkHighestNumber(great1, great2, great3);
//
//        //Given a text input and a number input, if the text is equal to “FastTrack” AND the
//        //number is equal to or lower than 3, print the text and the number. If the text is not
//        //“FastTrack” AND the number is equal to or higher than 4, print the number and the text,
//        //in this order.
//
//        System.out.println("Enter a text and no here: ");
//        op.printTxtNo(scan.next(), scan.nextInt());
//
//
//        //Given a no, while the no is equal to or lower than 100, print it
//
//        for (int i = firstNumber; i <= 100; i++) {
//            System.out.println(i);
//        }
//
//        // Given a number, while the number is equal to or lower than 100, print the number;
//        while (firstNumber <= 100) {
//            System.out.println(firstNumber);
//            firstNumber++; //fara incrementare e infinite loop
//        }
//        op.printToHundred(firstNumber); //ca sa pot printa in main
//
//        // Write a java program to count backwards from a given number to a lower given number
//
//        op.countReverse(scan.nextInt());
//        // Write a Java program by using two for loops to produce the output shown below:
//        //*******
//        //******
//        //*****
//        //****
//        //***
//        //**
//        //*
//        //Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average.
//
//        op.starExercise();//nu e nevoie de parametrii aici pt ca stiu de cate ori fac
//        System.out.print("*");
//
        //Clasa Hawk
//        Hawk hawk = new Hawk();
//        hawk.sleeps();
//        System.out.println("Sometimes naps for a few minutes.");
//        hawk.plays();
//        System.out.println("With its prey");
//        hawk.eatsFood();
//        System.out.println("Yeah, tiny mice too.");
//        hawk.haunts();
//        System.out.println("Mice");
//        hawk.flies();
//        System.out.println("High in the sky.");
//        hawk.setLaysEggs(true);
//
//        //Clasa Intern
//        Intern intern = new Intern();
//        intern.naps();
//        System.out.println("He naps every day.");
//        intern.studies();
//        System.out.println("He studies every day");
//        intern.brushes();
//        System.out.println("He brushes small animals only.");
//        intern.vaccinates();
//        System.out.println("He vaccinates cats only");
//
//        //Clasa Employee
//        Employee employee = new Employee();
//        employee.checksInOut();
//        System.out.println("When he arrives at and leaves the office.");
//        employee.paysTaxes();
//        System.out.println("He pays a lot of money as taxes.");
//        employee.requiresGymMembership();
//        System.out.println("Because he needs to get relaxed and be healthy too.");
//        employee.requiresSallaryIncrement();
//        System.out.println("When he goes beyond his average work standard.");
//        employee.setFoodTickets(true);
//        System.out.println(employee.setFoodTickets(true));
//
//        //Clasa Doctor
//        Doctor doctor = new Doctor();
//        doctor.checksInOut();
//        System.out.println("Just like any employee, doctor checks in and out when at office.");
//        doctor.paysTaxes();
//        System.out.println("He pays like any employee.");
//        doctor.requiresGymMembership();
//        System.out.println("Doctor needs to keep fit and healthy too.");
//        doctor.requiresSallaryIncrement();
//        System.out.println("He needs bigger sallary as a doctor.");
//        doctor.breeds();
//        System.out.println("He breeds birds and cats.");
//        doctor.operates();
//        System.out.println("He operates animals.");
//        doctor.teaches();
//        System.out.println("Doctor teaches the Intern to take care of animals.");
//        doctor.injects();
//        System.out.println("Doctor injects animals");
//        int suma = 90;//tip numevariabila = valoare
//        Doctor doctor1 = new Doctor();//tip este clasa, nume variabila aici e doctor1 = constructor new nume clasa (), cu sau fara parametrii
//        System.out.println("Total no of study years is " + doctor1.totalStudyYears());
//        doctor1.setHomeStudyYears(6); //cu set pun valorile pt fiecare doctor, nu le va lua pe cele din Clasa doctor automat
//        doctor1.setPracticeYears(11);
//        System.out.println("Total no of study years is " + doctor1.totalStudyYears());


        //3. Modify the program to sum from 111 to 8899, and compute the average. Introduce an int variable called count to count the numbers in the specified range.

//        int sum3; //am declarat in Main variabila ca sa o vada
//        sum3 = op.sum3(); //obiect care are acces la toate met. din clasa Op Logice, dar ele se executa in main.
//        //apeleaza metoda sum3 care returneaza (trebuie return in op logice nu void) rezultatul ei.
//        System.out.println("Suma 111-8899 Ex. este " + sum3);
//
//        double avg;
//        avg = op.avg();
//        System.out.println("Media 111-8899 Ex. este " + avg);

        // System.out.print("Counter for 111-8899 is " + counter); nu pot counter

        //6. Write the program do display the first 20 Fibonacci numbers
        //String fibNos = op.fibonacciEx();
//        System.out.println("First 20 Fibonacci no. are " + fibNos);
//
//        int first = 0;
//        int second = 1;
//        for (int i = 1; i < 20; i++) {
//            System.out.println(second);
//            int sum = first + second;
//            first = second;
//            second = sum;
//        }
//
//
//        // 5. Write a program to sum those numbers from 1 to 100 that is divisible by 7, and compute the average.
//
//        avg = op.avgNoDiv7();
//        System.out.println("Average 1-100/7 is " + avg);
//
//        // Modify DO WHILE loops 4. Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100.
//
//        avg = op.averageDoWhile();
//        System.out.println("Average of no. btw. 1-100, using do-while loop is: " + avg);
//
//        //Array exercises
//        //Array ex1.
//        int[] myAverage = op.setArrayHundred(); //un array compl de la 1-100 returnat
//        int[] myArray = op.setArrayHundred();
//
//        // Array ex2 - average value of array elements
//        System.out.println(op.getArrayAverage(myArray));
//        //Tema Arrays
//        // Array ex3 - Write a Java program to test if an array contains a specific value.
//        //1. For Each Loop and If
//
//
//        //Array ex4 - Write a Java program to find the index of an array element.
//
//        //Tema Overload Calculator
//        //1. Overload adunare
//        System.out.println("Overload pt. adunare calc este " + (calc.adunare(2, 3, 4, 5)));
//        //2. Overload adunare double
//        System.out.println("Overload pt. adunare cu cast double calc este " + (calc.adunare(2.2, 2.3, 1.2)));
//        //3. Overload float scadere
//        System.out.println("Overload pt. scadere float este " + (calc.scadere(2, 3, 11)));
//        //4. Overload int scadere
//        System.out.println("Overload pt. scadere int este " + (calc.scadere(10, 5)));
//        //5. Overload double impartire
//        System.out.println("Overload pt. impartire double este " + (calc.impartire(2.5, 50)));
//        //6. Overload impartire mai multi parametrii
//        System.out.println(("Overload pt. impartire m.m. parametrii este  " + (calc.impartire(30, 3, 2))));
//        //7. Overload inmultire float
//        System.out.println(("Overload pt. inmultire float este " + (calc.inmultire(10, 50000f))));
//        //8. Overload inmultire m.m. parametrii
//        System.out.println(("Overload inmultire m.m. parametrii este " + (calc.inmultire(2, 3, 10))));
//        //9. Overoad putere m.m. parametrii + inmultire
//        System.out.println(("Overload putere m.m. parametrii si inmultire este " + (calc.putere(2, 2, 4))));
//        //10. Overload putere m.m parametrii si impartire, inmultire
//        System.out.println(("Overload putere m.m parametrii si impartire, inmultire este " + (calc.putere(2, 2, 3, 3))));
//        //11. Overload modulo double
//        System.out.println("Overload modulo double este " + calc.modulo(35, 6, 2));
//        //12. Overload modulo adunare
//        System.out.println("Overload modulo cu adunare este " + calc.modulo(45, 2, 30, 3));
//        //13. Overload radical cu impartire
//        System.out.println("Overload radical cu impartire este " + calc.radical(25, 5));
//

//Array List
        //1. Given a list of numbers, check which one is the highest and print it
        Citire citire = new Citire();
        List<Integer> lista = citire.getListFromUser();
        System.out.println(op.getHighestNumber(lista));
        int xx = citire.getNumberfromKy();//inlicuim scannerul cu getnumeber from ky pt ca e mai buna
        op.printToHundred(citire.getNumberfromKy());

        //2. Given a list of numbers, determine all of the even numbers
        System.out.println(op.evenNumbersFromList(lista));

        //3.Write a Java program to iterate through all elements in loop starting at the specified position
        //a.using while loop and linked list
//LinkedList<String> l_list = new LinkedList<String>();
//        l_list.add("10");
//        l_list.add("20");
//        l_list.add("30");
//        l_list.add("40");
//        l_list.add("50");
//        l_list.add("60");
//        l_list.add("70");
//        l_list.add("80");

        //set Iterator i = l_list.listIterator(4);
        // print list from position previously set
        //while (i.hasNext()) {
           // System.out.println(i.next());
        //}
        //b.using for loop & if statement in Operatii Logice
       // String[] arrBeverages = {"latte", "chai", "cappuccino", "espresso", "milkshake"};
       // op.arrBeverages();

        //4.Write a Java program to sort an array or a list
        //a.Int Array with Array.sort

        //op.arrSortEx();
        //System.out.println(arrSort[i]); //nu pot printa aici
        //b.String Array List with Collections

//         ArrayList<String> bookType = new ArrayList<>();
//            bookType.add("Sci-Fi");
//            bookType.add("Mystery");
//            bookType.add("Romance");
//            bookType.add("Poetry");
//
//            Collections.sort(bookType);
//
//            System.out.println("These are the book types: "+ bookType);
//
//         float y = citire.getFloatfromKy();//aici chem metoda din citire
//        Program program = new Program();
//        program.runProgram();//nu mai apelez print, e deja in clasa Program, e suficient run

    }

    }

