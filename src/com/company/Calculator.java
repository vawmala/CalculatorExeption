package com.company;

public class Calculator {


    public void choice(String[] strings) {
        if (strings[1].equals("+")) {
            sum(strings);
        } else if (strings[1].equals("-")) {
            diff(strings);
        } else if (strings[1].equals("*")) {
            mult(strings);
        } else if (strings[1].equals("/")) {
            div(strings);
        }
    }

    public void sum(String[] strings) {
        int res = Integer.parseInt(strings[0]) + Integer.parseInt(strings[2]);
        System.out.println("Результат: " + res);
    }


    public void diff(String[] strings) {
        int res = Integer.parseInt(strings[0]) - Integer.parseInt(strings[2]);
        System.out.println("Результат: " + res);

    }


    public void div(String[] strings) {
        try {
            int res = Integer.parseInt(strings[0]) / Integer.parseInt(strings[2]);
            System.out.println("Результат: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль запрещено в данной программе");
        }
    }


    public void mult(String[] strings) {
        int res = Integer.parseInt(strings[2]) * Integer.parseInt(strings[0]);
        System.out.println("Результат: " + res);
    }


}

