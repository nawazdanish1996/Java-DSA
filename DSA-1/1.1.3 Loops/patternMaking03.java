package com.company;

public class patternMaking03 {

    public static void main(String[] args) {

        int n = 4;

        // Outer Loop
        for (int i=n; i>=1; i--){
            //inner Loop
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
