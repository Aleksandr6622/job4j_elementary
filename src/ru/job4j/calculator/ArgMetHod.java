package ru.job4j.calculator;

public class ArgMetHod {
    public static void hello(String name) {
        System.out.println("Hello,"+ name);
    }
    public static void main(String[] args) {
        String name = "Aleksandr Gorbachewsky";
        int age = 20;
        ArgMetHod.hello("");
        System.out.println();
        ArgMetHod.hello(name+age);
        System.out.println();
        ArgMetHod.hello(Integer.toString( age));
        System.out.println();
        ArgMetHod.hello(name+name+name);
        System.out.println();

    }
}

