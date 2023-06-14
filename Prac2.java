
import java.util.Scanner;

public class Prac2 {
  public static void main(String[] args){
      Scanner sc = new Scanner (System.in);
      int []a = new int[20];
      int n,x,i,flag = 0;
      
      System.out.println("How many elements?");
       n = sc.nextInt();
       
      System.out.println("Enter an elements for the array");
      
      for(i=0;i<n;i++){
          a[i] = sc.nextInt();
      }
      
      System.out.println("Enter elemnts to search");
      x = sc.nextInt();
      
      for(i=0;i<n;i++){
          if(a[i] == x){
              flag = 1;
              break;
          }
      }
      
      if(flag==1){
          System.out.println("Element is found at position: " + (i + 1));
      }
      else {
          System.out.println("Element is not found");
      }
  }    
}
