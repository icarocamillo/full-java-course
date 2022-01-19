import java.util.Locale;
import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) {
	   
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      int cod = sc.nextInt();
      int qtd = sc.nextInt();
      double total;
      
      if (cod == 1) {
         total = (double)qtd * 4.0;
      } 
      else if (cod == 2) {
         total = (double)qtd * 4.5;
      } 
      else if (cod == 3) {
         total = (double)qtd * 5.0;
      } 
      else if (cod == 4) {
         total = (double)qtd * 4.0;
      } 
      else {
         total = (double)qtd * 1.5;
      }

      System.out.printf("Total: R$ %.2f", total);
      
      sc.close();
   }
   
}