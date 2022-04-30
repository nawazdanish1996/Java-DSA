package com.company;

import java.util.Scanner;

public class two_D_Array {

    public static void main(String[] args) {
        // 2-D Array Declaration
        // type[][] arrayName = new type[rows][columns];
        // int[][] numbers = new int [3][5];

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Declaring Array
        int [][] numbers = new int[rows][cols];

        // input
        // Rows
        for (int i=0; i<rows; i++){
            // Columns
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();

            // input
//            3
//            5
//            1 2 3 4 5
//            6 4 3 2 1
//            1 2 3 4 5
        }
    }
}
