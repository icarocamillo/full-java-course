package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
	
   public static void main(String[] args) {
	   
      System.out.println("Somando uma unidade de tempo");
      
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
      System.out.println(sdf.format(d));
      Calendar cal = Calendar.getInstance();
      cal.setTime(d);
      cal.add(11, 4);
      d = cal.getTime();
      System.out.println(sdf.format(d));
      System.out.println();
      
      System.out.println("Obtendo uma unidade de tempo");
      SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      
      Date e = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
      System.out.println(sdf2.format(d));
      Calendar cal2 = Calendar.getInstance();
      cal.setTime(e);
      
      int minutes = cal2.get(12);
      int month = 1 + cal2.get(2);
      System.out.println("Minutes: " + minutes);
      System.out.println("Month: " + month);
   }
}