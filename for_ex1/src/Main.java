import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) {
	   
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int numero = 0;
      int cont_in = 0;
      int cont_out = 0;
      
      for(int i=0;i<n;i++) {
    	 numero = sc.nextInt();
    	 
         if (numero >= 10 && numero <= 20) {
            cont_in++;
         } 
         else {
            cont_out++;
         }

      }

      System.out.printf("%d in%n%d out", cont_in, cont_out);
      
      sc.close();
   }
   
}