import java.util.Locale;
import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) {
	   
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();

      for(int i=0;i<n;i++) {
         double v1 = sc.nextDouble();
         double v2 = sc.nextDouble();
         
         if (v2 == 0.0D) {
            System.out.println("divisão impossivel");
         } 
         else {
            double valor = v1 / v2;
            System.out.print(valor);
         }
         
      }

      sc.close();
   }
   
}