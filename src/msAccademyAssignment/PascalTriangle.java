package msAccademyAssignment;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 7;
        
        int[][] triangle = new int[rows][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
