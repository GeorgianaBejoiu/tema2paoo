package homework118;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortare {
	 public static void main(String[] args) {
		 List<Integer> numere=new ArrayList<>();
		 numere.add(5);
		 numere.add(2);
		 numere.add(12);
		 numere.add(8);
		 numere.add(3);
		 
		 // Folosim API-ul Java pentru a sorta lista
		 Collections.sort(numere);
		 
		 System.out.println("Lista sortata:"+numere);
	 }

}
