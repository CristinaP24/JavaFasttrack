package com.company;

public class Calculator {
    public int adunare(int primul, int aldoilea) {
        //int result = primul + aldoilea;
        //return result;
        return primul + aldoilea;
    }

    //Overload int adunare
    public int adunare(int primul, int aldoilea, int altreilea, int alpatrulea) {
        return primul + aldoilea + altreilea + alpatrulea;
    }

    //Overload adunare cast double
    public double adunare(double primul, double aldoilea, double altreilea) {
        return primul + aldoilea + altreilea;
    }

    public String myName() {
        return "Maria";
    }

    public float scadere(float valoareaPrima, float valoareaDoi) {
        return valoareaPrima - valoareaDoi;
    }

    //Overload float scadere
    public float scadere(float valoarePrima, float valoareaDoi, float valoareaTrei) {
        return ((valoareaTrei - valoareaDoi) - valoarePrima);
    }

    //Overload int scadere
    public int scadere(int valoareaPrima, int valoareaDoi)
    {
        return valoareaDoi - valoareaPrima;
    }

    public int impartire(int valUnu, int valDoi)
    {
        return valUnu / valDoi;
    }

    //Overload impartire double
    public double impartire(double valUnu, int valDoi) {
        return ((double) valDoi / valUnu);
    }

    //Overload impartire mai multi parametrii
    public int impartire(int valUnu, int valDoi, int valTrei) {
        return ((valUnu / valDoi) / valTrei);
    }


    public int inmultire(int numarPrim, int numarSecund) {
        return numarPrim * numarSecund;
    }

    //Overload inmultire float
    public float inmultire(int numarPrim, float numarSecund) {
        return ((float) numarPrim * numarSecund);
    }

    //Overload inmultire m.m. parametrii
    public int inmultire(int numarPrim, int numarSecund, int numarTert) {
        return numarPrim * numarSecund * numarTert;
    }


    public int modulo(int numarA, int numarB) { //pas 1 - scriu in obiectul calculaor o metoda de calcul
        return numarA % numarB;
    }
    //Overload modulo double
    public double modulo (int numarA, int numarB, int numarC){
        return (numarA % numarB) % numarC;
    }

    //12. Overload modulo cu adunare
    public double modulo (int numarA, int numarB, int numarC, int numarD){
        return ((numarB % numarA)+ (numarC % numarD));
    }


    public double putere(double numarE, double numarF) {
        return Math.pow(numarE, numarF);
    }

    //Overload putere m.m.parametrii si inmultire
    public double putere(double numarE, double numarF, int numarG) {
        return ((Math.pow(numarE, numarF) * ((numarG))));
    }
    //Overload putere m.m parametrii si impartire, inmultire
    public int putere(int numarE, int numarF, int numarG, int numarH) {
        return (int)(((Math.pow (numarE,numarF)*(Math.pow(numarG, numarH)))));
        }

        public double radical (double numarC){
            return Math.sqrt(numarC);
        }
        //Overload radical cu impartire
        public double radical (double numarD, double numarE){
        return ((Math.sqrt(numarD)/(int)(numarE)));
        }

        public int radical2 ( int nrCast1, int nrCast2){
            return (int) (Math.pow(nrCast1, nrCast2));
        } //Cast pt. a permite functiei radical sa opereze cu int


    }

// get si set doar la atribute, nu la calculator, nu la metode, cand pui set nu pui return, get returneaza
// pun tipul de data in fata functiei si va aplica conversia (int) inainte de Math.pow
// CUM Apelez adunare? Cu SOUT + string ce vrei sa indice


