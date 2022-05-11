package com.akrecev.myidea;

import java.util.Scanner;

public class StudyTest {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        Scanner console = new Scanner(System.in);
        while (console.hasNextInt()) {
            int i = console.nextInt();
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
