import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) {
	   
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Digite o primeiro valor: ");
      int valor1 = sc.nextInt();
      
      System.out.print("Digite o segundo valor: ");
      int valor2 = sc.nextInt();
      
      int soma = valor1 + valor2;
      System.out.printf("A soma dos valores é: %d", soma);
      
      sc.close();
   }
}
