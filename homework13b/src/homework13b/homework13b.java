
package homework13b;
import java.util.Scanner;
public class homework13b {   
   public static void main(String[] args) {        
       Scanner  SC= new Scanner(System.in);
        double num1 = SC.nextDouble();
        double num2 = SC.nextDouble();
      double c = minFunction(num1, num2); 
      System.out.println(c);         
   }
   public static double minFunction(double n1, double n2) {
      double n3= 0;
      if (n1==1){
          n3=n2;
      }
      else {
      n3=n2;
      for(int x= 1; n1>x ; ++x){
      n3=n3*n2;
      }}
      
      return n3; 
   }
}