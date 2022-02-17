package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.LegalPerson;
import entities.PhysicalPerson;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of taxpayers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Taxpayer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			Double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthSpending = sc.nextDouble();
				list.add(new PhysicalPerson(name, anualIncome, healthSpending));
			}
			else {
				System.out.print("Number of employees: ");
				Integer numberEmployees = sc.nextInt();
				list.add(new LegalPerson(name, anualIncome, numberEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
	
		for (Person person : list) {
			System.out.println(person.getName() + ": $ " + String.format("%.2f", person.tax()));
		}
		
		System.out.println();
		Double totalTaxes = 0.0;
		for (Person person : list) {
		totalTaxes += person.tax();
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		
		sc.close();
	}
	
}
