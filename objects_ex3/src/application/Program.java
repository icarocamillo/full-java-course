package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
   public static void main(String[] args) {
	   
      Locale.setDefault(Locale.US);
      
      Scanner sc = new Scanner(System.in);
      Student st = new Student();
      
      System.out.print("Name: ");
      st.name = sc.nextLine();
      System.out.println("Grades: ");
      st.grade1 = sc.nextDouble();
      st.grade2 = sc.nextDouble();
      st.grade3 = sc.nextDouble();
      st.calculateGrade();
      
      System.out.println("FINAL GRADE = " + st.finalGrade);
      if (st.finalGrade > 60.0) {
         System.out.println("PASS");
      } 
      else {
         System.out.println("FAILED");
         System.out.printf("MISSING %.2f POINTS", st.missingGrade());
      }

      sc.close();
   }
   
}