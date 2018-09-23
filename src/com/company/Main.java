package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    int total = 0;
        Scanner keyboard = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            System.out.println("What are the shifts in industry " + i + "?");
            for (int j = 0; j < 12; j++) {
                total = total + keyboard.nextInt();
            }
        }
        System.out.println("Total industry shift: " + total);
    }
}
