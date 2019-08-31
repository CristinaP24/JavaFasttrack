package com.company;
public class HwJava
{
    public class CoffeeLove
    {
        String salavationForMe = "Cope with stress with your help.";
        int vanillaShots = 4;
        double cafeineUnits = 3.25;
    }

    public static void main(String[] args) {
        //1 Declararea tututror tipurilor de variabile
        int localVariable = 12;
        int localVariable2 = 1234567;
        byte age = 100;
        short code = 1256;
        long money = 1245989l;
        float money2 = 1.2f;
        double money3 = 1459.24;
        char interjection = 'a';
        boolean sleepy = true;

      // 2 Declarare variabile locale + operatii cu variabile

        String loveCoffee;
        loveCoffee = "Latte is pure bliss, folks!";
        System.out.println(loveCoffee);

        int coffeeCupsIneed = 5;
        int coffeeCupsIhave = 3;
        int coffeeCupsExtra = 1;
        System.out.println(coffeeCupsExtra!=coffeeCupsIhave);

        int coffeeTotal = coffeeCupsIhave + coffeeCupsExtra;


        int specialTimes = coffeeTotal++;
        int badLuck = --coffeeCupsExtra;
        System.out.println(badLuck);

        boolean coffeeCupsAnytime = true;
        boolean justaCoffeeDream = true;
        if ((coffeeCupsAnytime = true) && (justaCoffeeDream = true)) {
            System.out.println("Keep dreaming you endlessly drink coffee! ");
        }

        if ((coffeeCupsAnytime = true)&& (justaCoffeeDream = false)) {
            System.out.println("Want to replace blood with coffee?");
        }
        System.out.println(coffeeTotal);
        System.out.println(specialTimes);

        int realCoffee = coffeeCupsIhave - coffeeCupsExtra;
        System.out.println(realCoffee);

        int coffeeHeaven = coffeeCupsIneed * coffeeCupsIhave;
        System.out.println(coffeeHeaven);

        float usualCoffee = 3f;
        float cheapDays = 3f;
        float boringDays = 2f;

        float blackDays = usualCoffee /cheapDays;
        float mostDays = cheapDays % usualCoffee;
        System.out.println(blackDays);
        System.out.println(mostDays);
        System.out.println(usualCoffee==boringDays);
        System.out.println(boringDays<=usualCoffee);
        System.out.println(cheapDays>=coffeeCupsIhave);
char latte= 'u';
char doubleLatte ='m';
String caffeLatte = "yum";
String cinammonSpice ="my";
        System.out.println(caffeLatte+cinammonSpice);
        System.out.println(latte&doubleLatte);
        System.out.println(coffeeCupsIneed|coffeeCupsExtra);
        System.out.println(coffeeCupsIneed^coffeeCupsExtra);
        System.out.println(~age);
        System.out.println(localVariable<<coffeeCupsIneed);
        System.out.println(coffeeCupsIneed>>coffeeCupsExtra);
        System.out.println(localVariable2>>>age);
        System.out.println(coffeeCupsIneed+=coffeeCupsExtra);
        System.out.println(coffeeTotal-=realCoffee);
        System.out.println(code*=money);


    }
}
