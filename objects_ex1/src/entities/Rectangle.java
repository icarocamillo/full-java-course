package entities;

public class Rectangle {
	
   public double width;
   public double height;

   public double calculateArea() {
      return this.width * this.height;
   }

   public double calculatePerimeter() {
      return 2.0D * this.width + 2.0D * this.height;
   }

   public double calculateDiagonal() {
      return Math.sqrt(this.width * this.width + this.height * this.height);
   }

   public String toString() {
      return "AREA = " 
    	+ String.format("%.2f%n", this.calculateArea()) 
    	+ "PERIMETER = " 
    	+ String.format("%.2f%n", this.calculatePerimeter()) 
    	+ "DIAGONAL = " 
    	+ String.format("%.2f%n", this.calculateDiagonal());
   }
}
