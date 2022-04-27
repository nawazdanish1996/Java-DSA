package com.company;

import java.util.*;

public class TimeComplexity02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //outer loop
        for (int i=0; i<n; i++){
            // inner loop
            for (int j=0; j<m; j++){
                System.out.println("Hello");
            }
        }
    }
}
