package ru.job4j.calculator;

public class ArgMetHod {
    public static void hello(String name) {
        System.out.println("Hello,"+ name);
    }
    public static void main(String[] args) {
        String name = "Aleksandr Gorbachewsky";
        int age = 20;
        ArgMetHod.hello(name);
        System.out.println("Hello,"+ name);
        ArgMetHod.hello(name+age);
        System.out.println("Hello,"+ name+age);
        ArgMetHod.hello(name+Integer.toString(age));
        System.out.println("Hello,"+ age);
        ArgMetHod.hello(name+name+name);
        System.out.println("Hello,"+ name+name+name);

    }
}

