public class Prac {

  public static void main (String[] args){
      
      int data[] = {1,2,9,4,3,2,1,7,5,3};
      int max = data[0];
      int k;
      int Loc = 1;
      int N = 10;
      
      for(k=0 ; k<N ; k++){
          if(max<data[k]){
              max = data[k];
              Loc = k;
          }
      }
      
      System.out.println("The maximum value is: " + max);
      System.out.println("The location of maximum value is: " +Loc);
  }    
}
