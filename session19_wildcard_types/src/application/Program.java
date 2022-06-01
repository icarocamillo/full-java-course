package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}	
	}
	
	/*public static void main(String[] args) {
		List<?> list = new ArrayList<Integer>();
		list.add(3); //Impossible do add values to a generic list type
		}*/
	
}