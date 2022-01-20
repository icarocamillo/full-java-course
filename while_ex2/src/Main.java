import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) {
	   
      Scanner sc = new Scanner(System.in);
      
      int x = sc.nextInt();

      for(int y = sc.nextInt(); x != 0 && y != 0; y = sc.nextInt()) {
         if (x >= 1 && y >= 1) {
            System.out.println("Primeiro");
         } 
         else if (x <= 1 && y >= 1) {
            System.out.println("Segundo");
         } 
         else if (x <= 1 && y <= 1) {
            System.out.println("Terceiro");
         } 
         else {
            System.out.println("Quarto");
         }

         x = sc.nextInt();
      }

      sc.close();
   }
}