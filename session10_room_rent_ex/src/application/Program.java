package application;

import entities.Customer;
import java.util.Scanner;

public class Program {
	
   public static void main(String[] args) {
	   
      Scanner sc = new Scanner(System.in);
      
      System.out.print("How many rooms will be rented? ");
      int n = sc.nextInt();
      
      Customer[] vect = new Customer[10];

      for(int i=0; i<n; i++) {
         sc.nextLine();
         System.out.printf("Rent #%s:%n", i + 1);
         System.out.print("Name: ");
         String name = sc.nextLine();
         System.out.print("Email: ");
         String email = sc.nextLine();
         System.out.print("Room: ");
         int room = sc.nextInt();
         
         vect[room] = new Customer(name, email, room);
         System.out.println();
      }

      System.out.println("Busy rooms:");

      for(int i=0; i<vect.length; i++) {
         if (vect[i] != null) {
            System.out.println(vect[i]);
         }
      }

      sc.close();
   }
}