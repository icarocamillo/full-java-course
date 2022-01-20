package entities;

public class Account {
	
   private int number;
   private String holder;
   private double balance;
   
   private static double TAX = 5.0;

   public Account(int number, String holder) {
      this.number = number;
      this.holder = holder;
   }

   public Account(int number, String holder, double initialDeposit) {
      this.number = number;
      this.holder = holder;
      this.deposit(initialDeposit);
   }

   public int getNumber() {
      return this.number;
   }

   public String getHolder() {
      return this.holder;
   }

   public void setHolder(String holder) {
      this.holder = holder;
   }

   public double getBalance() {
      return this.balance;
   }

   public void deposit(double amount) {
      this.balance += amount;
   }

   public void withdraw(double amount) {
      this.balance -= amount + TAX;
   }

   public String toString() {
      return "Account " 
    	+ this.number 
    	+ ", Holder: " 
    	+ this.holder 
    	+ ", Balance: $ " 
    	+ String.format("%.2f", this.balance);
   }
}
