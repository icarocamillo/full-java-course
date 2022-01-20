package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	
   public static void main(String[] args) {
	   
      List<String> list = new ArrayList<>();
      
      list.add("Maria");
      list.add("Alex");
      list.add("Bob");
      list.add("Anna");
      list.add(2, "Marco");
      
      System.out.println(list.size());
      for (String x :list) {
         System.out.println(x);
      }
      
      System.out.println("---------------------");
      
      //list.remove(1); //Remove based on list position
      
      // Lambda Function 'predicate', returns true or false
      list.removeIf(x -> x.charAt(0) == 'M');   // OR list.removeIf((xx) -> {return xx.charAt(0) == 'M';}); 
      for (String x :list) {
          System.out.println(x);
       }

      System.out.println("---------------------");
      
      // How to find element position on list
      System.out.println("Index of Bob: " + list.indexOf("Bob"));
      System.out.println("Index of Marco: " + list.indexOf("Marco")); //Result is -1 because does not exist.
      
      System.out.println("---------------------");
      
      //How to find and print only who starts with A
      List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
      for (String x :result) {
          System.out.println(x);
      }
      
      System.out.println("---------------------");
      // How to find and print only the first one who starts with A
      String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
      System.out.println(name);

      System.out.println("---------------------");
      // How to find and print only the first one who starts with J, does not exist
      String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
      System.out.println(name2);
   }
}