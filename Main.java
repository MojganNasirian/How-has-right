package com.codeWithMojgan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean sameInputs = false;

        System.out.println("How many times Edward boiled water last week?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Please enter the seconds that Edward was not looking att pots: ");
            Scanner scanner2 = new Scanner(System.in);
            int a = scanner2.nextInt();
            int b = scanner2.nextInt();
            sameInputs = !(a == b);
        }
        if (sameInputs) {
            System.out.println("edward is right");
        } else System.out.println("gunilla has a point");
    }
}