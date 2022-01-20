import java.util.Locale;
import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) {
	   
      Locale.setDefault(Locale.US);
      
      Scanner sc = new Scanner(System.in);
      
      int qtdPeca1 = sc.nextInt();
      double valorPeca1 = sc.nextDouble();
      
      int qtdPeca2 = sc.nextInt();
      double valorPeca2 = sc.nextDouble();
      
      double resultado = (double)qtdPeca1 * valorPeca1 + (double)qtdPeca2 * valorPeca2;
      System.out.printf("VALOR A PAGAR: R$ %.2f", resultado);
      
      sc.close();
   }
}