package com.nazmulrobin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner myScanner = new Scanner(System.in);

        ChapterOne greeting = new ChapterOne();

        System.out.print("Your name please: ");
        String name = myScanner.nextLine();
        greeting.sayHello(name);
    }
}