package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(70);
        System.out.println("1 euro are"   +  "70 rubles");
        int dollar = Converter.rubleToDollar(60);
        System.out.println("1 dollar are" + "60 rubles");
    }
}