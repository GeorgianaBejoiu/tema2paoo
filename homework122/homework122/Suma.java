package homework122;

import java.util.Scanner;

public class Suma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer n1=null;
		Integer n2=null;
		
		try {
			// Citim primul număr
			System.out.print("Introduceți primul număr: ");
			String numar1=scanner.nextLine();
			 if (!numar1.isEmpty()) {
	                n1 = Integer.parseInt(numar1);
	            }
			 // Citim al doilea număr
			 System.out.print("Introduceți al doilea număr: ");
	            String numar2 = scanner.nextLine();
	            if (!numar2.isEmpty()) {
	                n2 = Integer.parseInt(numar2);
	            }
	         // Verificăm dacă vreunul dintre numere este null
	            if (n1 == null || n2 == null) {
	                throw new NullPointerException("Unul dintre numere este NULL!");
	            }
	            // Calculăm suma
	            int suma = n1 + n2;
	            System.out.println("Suma celor două numere este: " + suma);
		
	            //exceptie la introducerea unui text in loc de un numar
	 } catch (NumberFormatException e) {
         System.out.println("Eroare: Introduceți doar numere întregi!");
         //exceptie-unul dintre numere este null
     } catch (NullPointerException e) {
         System.out.println("Eroare: " + e.getMessage());
         //pentru alte cazuri
     } catch (Exception e) {
         System.out.println("Eroare necunoscută: " + e.getMessage());
     } finally {
         scanner.close();
     }
		
	}
}
