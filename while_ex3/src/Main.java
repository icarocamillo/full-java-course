import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) {
	   
      Scanner sc = new Scanner(System.in);
      
      System.out.printf("Combustíveis: %n 1. Álcool%n 2. Gasolina %n 3. Diesel %n 4. Fim %n %n Escolha: ");
      int cont_a = 0;
      int cont_g = 0;
      int cont_d = 0;

      for(int cod = sc.nextInt(); cod != 4; cod = sc.nextInt()) {
         switch(cod) {
         case 1:
            cont_a++;
            System.out.print("OK, digite o próximo combustível: ");
            break;
         case 2:
            cont_g++;
            System.out.print("OK, digite o próximo combustível: ");
            break;
         case 3:
            cont_d++;
            System.out.print("OK, digite o próximo combustível: ");
            break;
         default:
            System.out.print("Código Inválido, digite novamente: ");
         }
      }

      System.out.printf("%nMUITO OBRIGADO %nAlcool: %d%nGasolina: %d%nDiesel: %d%n", cont_a, cont_g, cont_d);
      
      sc.close();
   }
}