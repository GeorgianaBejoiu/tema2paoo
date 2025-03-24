package homework120;

import java.util.*;

public class StudentManager {

	private List<Student> listaStudenti;
	private Map<String, Student> studentMap;
	
	public StudentManager() {
		listaStudenti=new ArrayList<>();
		studentMap=new HashMap<>();
	}
	public void addStudent(Student student) {
		listaStudenti.add(student);
		studentMap.put(student.getName(), student);
	}
	public Student ceaMaiMareVarsta(List<Student> studenti) {
		return studenti.stream().max(Comparator.comparingInt(Student::getVarsta)).orElse(null);
	}
	 public static void main(String[] args) {
		 StudentManager manager = new StudentManager();
		 
		 manager.addStudent(new Student("Alice", 20));
	     manager.addStudent(new Student("Daniel", 25));
	     manager.addStudent(new Student("Ana", 22));
	     
	     Student varstaMare = manager.ceaMaiMareVarsta(manager.listaStudenti);
	     System.out.println("Studentul cu varsta cea mai mare: " + varstaMare);
	 }
}
