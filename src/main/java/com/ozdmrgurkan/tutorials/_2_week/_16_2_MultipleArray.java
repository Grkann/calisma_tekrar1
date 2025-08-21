package com.ozdmrgurkan.tutorials._2_week;

public class _16_2_MultipleArray {
    public static void main(String[] args) {
        int[][] matris = new int [3][3];
        matris[0][0] = 1;
        matris[0][1] = 3;
        matris[0][2] = 2;
        matris[1][0] = 8;
        matris[1][1] = 2;
        matris[1][2] = 4;
        matris[2][0] = 5;
        matris[2][1] = 1;
        matris[2][2] = 1;

        for (int i = 0; i < matris.length; i++) { // Satır (row)
            for (int j = 0; j < matris[i].length; j++) { // Sutün (col)
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
