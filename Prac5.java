
import java.util.Scanner;


public class Prac5 {
   public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int n,number,position;
        
        System.out.println("Enter Number of Elements in Array");
        n = sc.nextInt();
        
        System.out.println("Enter " + n + "Integers");
        
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
        
        System.out.println("Which Position You want to insert element");
        position = sc.nextInt();
        
        for(int i = n; i>=position; i--){
            array[i+1] = array[i];
        }
        
        System.out.println("What Element You want to insert");
        number = sc.nextInt();
        n = n+1;
        array[position] = number;
        
        System.out.println("After inserting the element");
        
        for(int i=0; i<n;i++){
            System.out.println(("a[" + i + "] = " + array[i]));
        }
        
   }    
}
