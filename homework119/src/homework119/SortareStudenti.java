package homework119;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortareStudenti {
	public static void main(String[] args) {
	        // Creare listă de studenți
	        List<Student> studenti = new ArrayList<>();
	        studenti.add(new Student("Florin", 9));
	        studenti.add(new Student("Maria", 10));
	        studenti.add(new Student("Ioana", 8));
	        studenti.add(new Student("Daniel", 7));

	        // Sortare după notă (crescător)
	        studenti.sort(Comparator.comparingInt(student -> student.nota));

	        // Afișare listă sortată
	        System.out.println("Studenți sortați după notă:");
	        for (Student s : studenti) {
	            System.out.println(s);
	        }
	    }
}
