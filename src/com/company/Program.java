package com.company;

public class Program {
    private Citire citire = new Citire();//se pun la niv de clasa ca sa fie mereu vazute in metode
    private Calculator calc = new Calculator();
    private OperatiiLogice op = new OperatiiLogice();

    private void printMenu() {

        System.out.println("" +
                "Hello \n" +
                "Select from menu:\n" +
                "1. Adunare\n" +
                "2. Scadere\n" +
                "3. Inmultire\n" +
                "4. Impartire\n" +
                "5. Ridicare la putere\n" +
                "6. Radical" +
                "0. Exit\n");
    }

    private boolean programMenu() {
        printMenu();
        int numberFromUser = citire.getNumberfromKy();

        switch (numberFromUser) {
            case 1:
                adunare();
                break;
            case 2:
                scadere();
                break;
            case 3:
                inmultire();
                break;
            case 4:
                impartire();
                break;
            case 5:
                ridicarePutere();
                break;
            case 6:
                radical();
                break;
            case 7:
                checkHighestNumber();
                break;
            case 8:
                checkMiddleNumber();
                break;
            case 9:
                checkNoFromUser(); //Check if no from user is odd or even
                break;
            case 10:
                //printtoHundred();
                break;
            case 11:
                //verifyWhether();
                break;
            case 12:
                enterAge();
                break;
            case 0:
                return false;
        }
        return true;
    }

    public void runProgram() { //ramane public
        boolean repeat;
        do {
            repeat = programMenu();//val ce vine de la program o atribui lui repeat, ca se executa o data macar programul
        } while (repeat); //cat timp e T, ruleaza programul, dupa ce sa rulat indeplinesc T/F si tot verific

    }

    private void adunare() { //o met privata ca sa nu mai scriu prea mult
        System.out.println("Introdu primul numar: ");
        int primul = citire.getNumberfromKy();
        System.out.println("Introdu al doilea numar: ");
        int alDoilea = citire.getNumberfromKy();
        int result = calc.adunare(primul, alDoilea);
        System.out.println("Rezultatul adunarii e: " + result);
//Tema 1. calculator toate operatiile
    }

    private void scadere() {
        System.out.println("Introdu primul numar pt. scadere: ");
        int primulN = citire.getNumberfromKy();
        System.out.println("Introdu al doilea numar pt. scadere: ");
        int alDoileaN = citire.getNumberfromKy();
        int resultN = calc.scadere(primulN, alDoileaN);
        System.out.println("Rezultatul scaderii e: " + resultN);
    }

    private void inmultire() {
        System.out.println("Introdu primul numar pt. inmultire: ");
        int primulNumInmultit = citire.getNumberfromKy();
        System.out.println("Introdu al doilea numar pt. inmultire: ");
        int alDoileaNumInmultit = citire.getNumberfromKy();
        int resultNumInmutire = calc.inmultire(primulNumInmultit, alDoileaNumInmultit);
        System.out.println("Rezultatul inmultirii e: " + resultNumInmutire);

    }

    private void impartire() {
        System.out.println("Introdu primul numar pt. impartire: ");
        int primulNumImpartit = citire.getNumberfromKy();
        System.out.println("Introdu al doilea numar pt. impartire: ");
        int alDoileaNumImpartit = citire.getNumberfromKy();
        int resultNumImpartit = calc.impartire(primulNumImpartit, alDoileaNumImpartit);
        System.out.println("Rezultatul impartire e: " + resultNumImpartit);

    }

    private void ridicarePutere() {
        System.out.println("Introdu primul numar pt. ridicare la putere: ");
        int primulNumPutere = citire.getNumberfromKy();
        System.out.println("Introdu al doilea numar pt. ridicare la putere: ");
        int alDoileaNumPutere = citire.getNumberfromKy();
        int resultNumPutere = calc.impartire(primulNumPutere, alDoileaNumPutere);
        System.out.println("Rezultatul ridicare la putere e: " + resultNumPutere);
    }

    private void radical() {
        System.out.println("Introdu primul numar pt. radical: ");
        double primulNumRadical = citire.getNumberfromKy();
        System.out.println("Introdu al doilea numar pt. radical: ");
        double alDoileaNumRadical = citire.getNumberfromKy();
        double resultNumRadical = calc.putere(primulNumRadical, alDoileaNumRadical);
        System.out.println("Rezultatul radical e: " + resultNumRadical);
    }

    //Tema 2.Operatii logice
    private void checkHighestNumber() {
        System.out.println("Introdu un numar aici sa vezi care e mai > ");
        int primulNo = citire.getNumberfromKy();
        System.out.println("Introdu al doilea numar aici sa vezi care e mai > ");
        int alDoileaNo = citire.getNumberfromKy();
        int resultCheckHighesNumber = op.checkHighestNumber(primulNo, alDoileaNo);
        System.out.println("Dintre cele 2 nr. introduse de tine, cel mai mare este " + resultCheckHighesNumber);
    }


    private void checkMiddleNumber() {
        System.out.println("Introdu un numar aici ");
        int primulNoM = citire.getNumberfromKy();
        System.out.println("Introdu al doilea numar aici  ");
        int alDoileaNoM = citire.getNumberfromKy();
        System.out.println("Introdu al treilea numar aici  ");
        int alTreileaNoM = citire.getNumberfromKy();
        int resultcheckMiddleNumber = op.checkMiddleNumber(primulNoM, alDoileaNoM, alTreileaNoM);
        System.out.println("Dintre cele 3 nr. introduse de tine, cel de la mijloc  este " + resultcheckMiddleNumber);
    }

    private void checkNoFromUser() {
        System.out.println("Introdu un numar aici sa vezi daca e par/impar  ");
        int primulNoParImpar = citire.getNumberfromKy();
        int resultcheckNoFromUser = op.checkNoFromUser(primulNoParImpar);
        System.out.println("Nr introdus de tine este " + resultcheckNoFromUser);
    }


private void enterAge (){
    System.out.println("Enter age for age voting exercise here ");
    int ageVoting = citire.getNumberfromKy();
    op.enterAge(ageVoting);
        System.out.println("You can vote.");

}
private void checkFloatNo () {
    System.out.println("Enter no. for check Float Number exercise here ");
    int noFloat = citire.getNumberfromKy();
    op.verifyWhether(noFloat);

}


}


