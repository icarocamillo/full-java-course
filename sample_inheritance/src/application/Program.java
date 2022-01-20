package application;

import entities.BusinessAccount;

public class Program {
	
   public static void main(String[] args) {
	   
      BusinessAccount account = new BusinessAccount(2022, "Ícaro Camillo", 120.0, 500.0);
      
      System.out.println(account.getBalance());
   }
}
