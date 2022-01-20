package entities;

public class Student {
	
   public String name;
   public double grade1;
   public double grade2;
   public double grade3;
   public double finalGrade;

   public double calculateGrade() {
      return this.finalGrade += this.grade1 + this.grade2 + this.grade3;
   }

   public double missingGrade() {
      return this.finalGrade < 60.0 ? 60.0 - this.finalGrade : 0.0;
   }
}