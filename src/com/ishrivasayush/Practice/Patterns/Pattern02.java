package com.ishrivasayush.Practice.Patterns;

import java.util.Scanner;

public class Pattern02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Value Of n.");
        int n=scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
