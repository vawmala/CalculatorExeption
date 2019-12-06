package com.company;

import com.sun.jdi.IntegerType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите желаемый пример для решение в формате:" + "a" + " * " + "b");
        System.out.println("Где a и b - переменные примера, * - арифметическое действие выполняемое в примере");
        Scanner scr = new Scanner(System.in);

        String s = scr.nextLine();
        String s1[] = s.split(" ", 3);
        Calculator calculator = new Calculator();
        calculator.choice(s1);

    }
}

