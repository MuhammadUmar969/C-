
import java.util.Scanner;

public class Prac7 {
   public static void main (String [] args){
       Scanner sc = new Scanner (System.in);
       
               int[] array = new int[100];
        int n = array.length, element, index = 0;
        
        System.out.println("ENTER NUMBER OF ELEMENTS IN ARRAY");
        n = sc.nextInt();
        System.out.println("ENTER " + n + " INTEGER");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            element = array[i];
            if (element < array[i - 1]) {
                for (int j = 0; j <= i; j++) {
                    if (element < array[j]) {
                        index = j;
                        for (int k = i; k > j; k--) {
                            array[k] = array[k - 1];
                        }
                        break;
                    }
                }
            } else {
                continue;
            }
            array[index] = element;
        }
        System.out.println("SORTED ARRAY:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

   }    
}
