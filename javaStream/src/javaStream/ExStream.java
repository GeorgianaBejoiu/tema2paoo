package javaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExStream {
	 public static void main(String[] args) {
		 //Lista initiala
		 List <Integer> numere=Arrays.asList(5, 3, 8, 1, 9, 7, 2);
		 
		 // 1. Aplicăm map()(ia elementul, aplica o functie si il returneaza) - Dublăm fiecare element
	        List<Integer> dublate = numere.stream()
	                                      .map(n -> n * 2)
	                                      .collect(Collectors.toList());
	        System.out.println("Numere dublate: " + dublate);
	        
	     // 2. Aplicăm filter() - Selectăm doar numerele mai mari decât 5
	        List<Integer> filtrate = numere.stream()
	                                       .filter(n -> n > 5)
	                                       .collect(Collectors.toList());
	        System.out.println("Numere mai mari decât 5: " + filtrate);
	        
	     //  3. Aplicăm sorted() - Sortare crescătoare
	        List<Integer> sortareCrescatoare = numere.stream()
	                                              .sorted()
	                                              .collect(Collectors.toList());
	        System.out.println("Sortare crescătoare: " + sortareCrescatoare);
	        
	     // 4. Aplicăm sorted() - Sortare descrescătoare
	        List<Integer> sortareDescrescatoare = numere.stream()
	                                                 .sorted((a, b) -> b - a)
	                                                 .collect(Collectors.toList());
	        System.out.println("Sortare descrescătoare: " + sortareDescrescatoare);
	        
	        // 5. Combinăm map(), filter(), sorted()
	        List<Integer> rezultatFinal = numere.stream()
	                                            .map(n -> n * 2) // Înmulțim cu 2
	                                            .filter(n -> n > 10) // Păstrăm doar cele peste 10
	                                            .sorted((a, b) -> b - a) // Sortăm descrescător
	                                            .collect(Collectors.toList());
	        System.out.println("Rezultatul final: " + rezultatFinal);
	 }
}
