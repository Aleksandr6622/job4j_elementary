package ru.job4j.calculator;

public class Calculater {
    public static void plus (int first,int second){
        int result = first + second;
        System.out.println(result);

    }

     public static void main (String[]args){
        Calculater.plus(100,500);
        Calculater.plus(4,2);
        Calculater.plus(3,5);
     }

     }