import java.util.Locale;
import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) {
	   
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      double t1 = 0.0D;
      double t2 = 0.0D;
      double t3 = 0.0D;

      for(int i=0;i<=n;i++) {
         t1 = sc.nextDouble();
         t2 = sc.nextDouble();
         t3 = sc.nextDouble();
         
         t1 *= 0.2;
         t2 *= 0.3;
         t3 *= 0.5;
         
         double soma = t1 + t2 + t3;
         
         System.out.printf("%.1f%n%", soma);
      }

      sc.close();
   }
   
}