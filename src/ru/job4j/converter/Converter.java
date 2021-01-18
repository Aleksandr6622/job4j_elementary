package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value ) {
        int rsl = value/70;
        return rsl;
    }
    public static int rubleToDollar(int value) {
        int rsl =  value/60;
        return rsl ;
    }
    public static void main(String[] args) {
        int rub =1000;
        int euro = Converter.rubleToEuro(rub);
        System.out.println(Integer.toString(rub)+"rubles are " + euro + " euro." );
        int dollar = Converter.rubleToDollar(rub);
        System.out.println(Integer.toString(rub)+"rubles are" + dollar + "dollar.");
    }
}