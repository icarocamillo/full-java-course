import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) {
	   
      Scanner sc = new Scanner(System.in);

      for(int senha = sc.nextInt(); senha != 2002; senha = sc.nextInt()) {
         System.out.println("Senha Inválida");
      }

      System.out.print("Acesso Permitido");
      
      sc.close();
   }
}