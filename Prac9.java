
import java.util.Scanner;

public class Prac9 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
                
         int f_row, f_col, s_row, s_col;
        System.out.print("ENTER NO OF ROWS OF FIRST MATRIX : ");
        f_row = sc.nextInt();
        System.out.print("ENTER NO OF COLOMNS OF FIRST MATRIX :  ");
        f_col = sc.nextInt();
        System.out.print("ENTER NO OF ROWS OF SECOND MATRIX : ");
        s_row = sc.nextInt();
        System.out.print("ENTER NO OF COLOMNS OF SECOND MATRIX : ");
        s_col = sc.nextInt();
        if (f_col != s_row) {
            System.out.println("ORDER OF MATRIX IS INCORRECT ");
        } else {
            int[][] first = new int[f_row][f_col];
            int[][] second = new int[s_row][s_col];
            int[][] result = new int[f_row][s_col];
            System.out.println("ENTER THE ELEMENTS OF FIRST MATRIX : ");
            for (int i = 0; i < f_row; i++) {
                for (int j = 0; j < f_col; j++) {
                    first[i][j] = sc.nextInt();
                }
            }
            System.out.println("ENTER THE ELEMENTS OF SECOND MATRIX : ");
            for (int i = 0; i < s_row; i++) {
                for (int j = 0; j < s_col; j++) {
                    second[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < f_row; i++) {
                for (int j = 0; j < s_col; j++) {
                    for (int k = 0; k < f_col; k++) {
                        result[i][j] += first[i][k] * second[k][j];
                    }
                }
            }
            System.out.println("MULTIPLICATION OF TWO MATRICS IS : ");
            for (int[] row : result) {
                for (int column : row) {
                    System.out.print(column + "    ");
                }
                System.out.println();
            }

    }  
    }
}
