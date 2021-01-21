package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (100) * 1.5;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (100) * 1.5;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = Fit.manWeight(height);
        System.out.println(Integer.toString(height) + "Man is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println(Integer.toString(+height) + "woman is " + woman);


    }

}

