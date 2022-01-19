package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
   public static void main(String[] args) {
	   
      Locale.setDefault(Locale.US);
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Product[] vect = new Product[n];

      double result;
      for(int i = 0; i < vect.length; ++i) {
         sc.nextLine();
         String name = sc.nextLine();
         result = sc.nextDouble();
         vect[i] = new Product(name, result);
      }

      double sum = 0.0D;

      for(int i = 0; i < vect.length; ++i) {
         sum += vect[i].getPrice();
      }

      result = sum / (double)vect.length;
      System.out.printf("AVERAGE PRICE: %.2f%n", result);
      
      sc.close();
      
   }
   
}