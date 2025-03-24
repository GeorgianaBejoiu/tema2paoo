package homework123;

import java.util.Scanner;

public class Ecuatiegrd2 {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		// Citirea coeficienților
	        System.out.print("Introduceti coeficientul a: ");
	        double a = scanner.nextDouble();
	        System.out.print("Introduceti coeficientul b: ");
	        double b = scanner.nextDouble();
	        System.out.print("Introduceti coeficientul c: ");
	        double c = scanner.nextDouble();
	        
	        // Calculul discriminantului
	        double delta = b * b - 4 * a * c;
	        
	        // Rezolvarea ecuatiei
	        if (a == 0) {
	            System.out.println("Aceasta nu este o ecuatie de gradul al doilea.");
	        } else if (delta > 0) {
	            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	            System.out.println("x1 = " + x1 + " si x2 = " + x2);
	        } else if (delta == 0) {
	            double x = -b / (2 * a);
	            System.out.println("x = " + x);
	        } else {
	            System.out.println("Ecuatia nu are solutii reale.");
	        }

	        scanner.close();
	 
	 }
}
