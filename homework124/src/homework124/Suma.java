package homework124;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        String fileName = "numere.txt"; 
        int suma = 0;

        try (Scanner scanner = new Scanner(new File(fileName))) { // Deschide fișierul corect
            while (scanner.hasNext()) {
                String valoare = scanner.next(); // Citim fiecare element din fișier
                
                try {
                    int numar = Integer.parseInt(valoare); // Convertim în int
                    suma += numar; // Adăugăm la sumă
                } catch (NumberFormatException e) {
                    // Ignorăm elementele care nu sunt numere întregi (float sau text)
                }
            }

            System.out.println("Suma numerelor întregi din fișier: " + suma);

        } catch (FileNotFoundException e) {
            System.out.println("Eroare: Fișierul nu a fost găsit!");
        } catch (Exception e) {
            System.out.println("Eroare necunoscută: " + e.getMessage());
        }
    }
}
