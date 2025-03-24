package exJavaReflection;

import java.lang.reflect.*;

public class Reflection {

	public static void main(String[] args) {
		try {
		// 1.Obținerea metadatelor clasei Student
		Class<?> clasaStudent = Class.forName("exJavaReflection.Student"); // Obținem clasa în timpul execuției
		System.out.println("Numele clasei: " + clasaStudent.getName());
		
		//2.Crearea unui obiect Student la runtime
		Constructor<?> constructor=clasaStudent.getConstructor(String.class, int.class);
		Object student=constructor.newInstance("David", 23);
		System.out.println("Obiect creat: " + student);
		
		// 3️. Obținerea și apelarea metodei obtineNume()
		Method metodaObtineNume = clasaStudent.getMethod("getNume");
		String nume=(String) metodaObtineNume.invoke(student);
		System.out.println(" Numele studentului: " + nume);
		
		  // 4️. Obținerea și apelarea metodei obtineVarsta()
        Method metodaObtineVarsta = clasaStudent.getMethod("getVarsta");
        int varsta = (int) metodaObtineVarsta.invoke(student);
        System.out.println(" Vârsta studentului: " + varsta);
        
     // 5️. Accesarea și modificarea unui atribut privat
        Field campNume=clasaStudent.getDeclaredField("nume");
        campNume.setAccessible(true); // Permitem accesul la atributul privat
        campNume.set(student, "Daniel"); // Modificăm valoarea atributului
        
        // Verificăm dacă modificarea a fost efectuată cu succes
        String numeNou = (String) metodaObtineNume.invoke(student);
        System.out.println(" Numele modificat: " + numeNou);
        
        
	}catch (Exception e) {
        e.printStackTrace();
	}
    }
}
