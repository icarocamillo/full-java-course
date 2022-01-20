import java.util.Locale;
import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) {
	   
      Locale.setDefault(Locale.US);
      
      Scanner sc = new Scanner(System.in);
      
      double func = sc.nextDouble();
      double hora = sc.nextDouble();
      double salario = sc.nextDouble();
      
      double resultado = hora * salario;
      System.out.printf("NUMBER = %.0f%n", func);
      System.out.printf("SALARY = U$ %.2f", resultado);
      
      sc.close();
   }
}