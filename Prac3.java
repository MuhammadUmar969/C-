
import java.util.Scanner;

public class Prac3 {
   
   public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
       
       int max = 5;
       int [] arr_search = new int[max];
       int i,element;
       
       System.out.println("Enter " + max + " Elements for Searching");
       
       for(i=0;i<max;i++){
           arr_search[i] = sc.nextInt();
       }
       
       System.out.println("Your Data");
       
       for(i=0;i<max;i++){
           System.out.println("\n" +arr_search[i]);
       }
       
       System.out.println("Enter elements to search: ");
       element = sc.nextInt();
       
       for(i=0;i<max;i++){
           if(arr_search[i]==element){
               System.out.println("\n Linear Search: Element:  " + element +
                       "Found at Position: " +(i+1));
               break;
           }
       }
       
       if(i==max){
           System.out.println("\n Search Element: " + element + " Not Found");
       }
       
   }    
}
