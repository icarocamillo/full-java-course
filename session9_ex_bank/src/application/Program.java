package application;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
   public static void main(String[] args) {
	   
      Locale.setDefault(Locale.US);
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter account number: ");
      int number = sc.nextInt();
      sc.nextLine();
      System.out.print("Enter account holder: ");
      String holder = sc.nextLine();
      System.out.print("Is there an initial deposit (y/n)? ");
      char response = sc.next().charAt(0);
      
      Account account;
      
      double deposit;
      if (response == 'y') {
         System.out.print("Enter initial deposit value: ");
         deposit = sc.nextDouble();
         account = new Account(number, holder, deposit);
      } 
      else {
         account = new Account(number, holder);
      }

      System.out.println();
      System.out.println("Account data:");
      System.out.println(account);
      System.out.println();
      
      System.out.print("Enter a deposit value: ");
      deposit = sc.nextDouble();
      System.out.println("Updated account data: ");
      account.deposit(deposit);
      System.out.println(account);
      System.out.println();
      
      System.out.print("Enter a withdraw value: ");
      deposit = sc.nextDouble();
      account.withdraw(deposit);
      
      System.out.println("Updated account data: ");
      System.out.println(account);
      
      sc.close();
   }
}