
import java.util.Scanner;


public class Prac10 {
   public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int row, col;
        System.out.print("ENTER NO OF ROWS OF  MATRIX :  ");
        row = scan.nextInt();
        System.out.print("ENTER NO OF COLOMNS OF MATRIX :  ");
        col = scan.nextInt();
        int[][] first = new int[row][col];
        int[][] second = new int[row][col];
        int[][] result = new int[row][col];
        System.out.println("ENTER THE ELEMENTS OF FIRST MATRIX : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                first[i][j] = scan.nextInt();
            }
        }
        System.out.println("ENTER THE ELEMENTS OF SECOND MATRIX : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                second[i][j] = scan.nextInt();
            }
        }
        System.out.println("Result: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = first[i][j] + second[i][j];    //use - for subtraction  
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

   }    
}
