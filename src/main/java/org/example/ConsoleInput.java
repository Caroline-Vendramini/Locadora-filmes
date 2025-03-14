package org.example;

import java.util.Scanner;
// classe auxiliar para manipular o Scanner
public class ConsoleInput {
    private static final Scanner sc = new Scanner(System.in);
    // le String que o usuario digitar no terminal
    public static String readString (String message){
        sc.nextLine();
        System.out.print(message);
        return sc.nextLine();
    }
    // le int que o usuario digitar no terminal
    public static int readInt (String message){
        System.out.print(message);
        return sc.nextInt();
    }
}
