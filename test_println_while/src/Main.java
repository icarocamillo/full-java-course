import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) {
	   
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      
      while( x < 5 ) {
         int y = x * 3;
         System.out.println(y);
         x++;
      }

      System.out.println("Fim");
      sc.close();
   }
}