package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int cnt = 0;
        int cntLast = 0;
        for (int i = a; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                cnt += j;
            }
            if (cnt == cntLast) {
                System.out.println(i);
                return;
            }
            cnt = 0;
            cntLast += i;
        }
    }
}