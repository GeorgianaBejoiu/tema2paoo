package homework121;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
	 public static void main(String[] args) {
	        // Creăm o listă de numere folosind Arrays.asList
	        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 8, 1));

	        // 1️ Afișarea elementelor folosind funcția lambda
	        System.out.println("Elementele array-ului:");
	        numbers.forEach(n -> System.out.println(n));

	        // 2️ Calcularea sumei folosind funcția lambda și forEach
	        final int[] suma = {0}; // Folosim un array, variabilele locale trebuie să fie finale în lambda
	        numbers.forEach(n -> suma[0] += n);
	        System.out.println("Suma folosind forEach: " + suma[0]);

	        // 3️ Calcularea sumei folosind Stream API
	        int sumaStream = numbers.stream().mapToInt(Integer::intValue).sum();
	        System.out.println("Suma folosind Stream API: " + sumaStream);
	    }
}
