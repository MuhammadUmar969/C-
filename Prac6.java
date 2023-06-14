
import java.util.Scanner;


public class Prac6 {
   public static void main (String [] args){
       Scanner sc = new Scanner (System.in);
       int [] a = new int[10];
       int n,position;
       
       System.out.println("Enter Number of Element in Array");
       n = sc.nextInt();
       
       System.out.println("Enter " + n + " Integers");
       
       for(int i = 0; i<n; i++){
           a[i] = sc.nextInt();
       }
       
       System.out.println("Which Positon of Element you want to delete");
       position = sc.nextInt();
       
       for(int i=position; i<n-1;i++){
           a[i] = a[i+1];
       }
       
       n = n - 1;
       
       System.out.println("After Deleting the Element");
       
       for(int i = 0; i<n; i++){
           System.out.println("a["+ i + "]=" + a[i]);
       }
       
   }    
}
