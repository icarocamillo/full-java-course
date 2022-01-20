package entities;

public class Customer {
	
   private String name;
   private String email;
   private int room;

   public Customer(String name, String email, int room) {
      this.name = name;
      this.email = email;
      this.room = room;
   }

   public String getName() {
      return this.name;
   }

   public String getEmail() {
      return this.email;
   }

   public int getRoom() {
      return this.room;
   }

   public String toString() {
      return this.getRoom() 
    	+ ": " 
    	+ this.getName() 
    	+ ", " 
    	+ this.getEmail();
   }
}