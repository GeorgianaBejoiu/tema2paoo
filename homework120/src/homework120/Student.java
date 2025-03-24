package homework120;

import java.util.*;

public class Student {

	private String nume;
	private int varsta;
	
	public Student(String nume, int varsta)
	{
		this.nume=nume;
		this.varsta=varsta;
	}
	public String getName() {
		return nume;
	}
	public int getVarsta() {
		return varsta;
	}
	
	@Override
	public String toString() {
		 return "Student{nume='" + nume + "', varsta=" + varsta + "}";
	}
}
