package com.company;

import java.util.Scanner;

public class two_D_Array_Question01 {
    public static void main(String[] args) {
        /* Q: Take a matrix as input form the user. Search for a
        given number x and print the indices at which it occurs?
         */

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input
        //rows
        for (int i=0; i<rows; i++){
            //columns
            for (int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        // outer loop
        for (int i=0; i<rows; i++){
            // inner loop
            for (int j=0; j<cols; j++){
                // compare with x
                if(numbers[i][j] == x){
                    System.out.println("x found at location (" + i +", " + j +" )");
                }
            }
        }
//        input
//        3
//        4
//        1 2 3 4
//        4 3 2 11
//        1 2 3 4
//        11

        // Location (1, 3)


    }
}
