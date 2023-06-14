
public class Prac4 {
    public static void main (String [] args){
          int i, j, temp, pass = 0;
        int[] a = {10, 2, 0, 14, 43, 25, 18, 1, 5, 45};

        System.out.println("Input list ...");
        for (i = 0; i < 10; i++) {
            System.out.println(a[i] + "\t");
        }

        System.out.println();

        for (i = 0; i < 10; i++) {
            for (j = i + 1; j < 10; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            pass++;
        }

        System.out.println("Sorted Element List ...");
        for (i = 0; i < 10; i++) {
            System.out.println(a[i] + "\t");
        }

        System.out.println("\nNumber of passes taken to sort the list: " + pass);

    }   
}
