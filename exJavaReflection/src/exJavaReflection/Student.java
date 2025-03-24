package exJavaReflection;


public class Student {

	private String nume;
    private int varsta;
    
    //constructor
    public Student(String nume, int varsta) {
    	this.nume=nume;
    	this.varsta=varsta;
    }
    
    //geterri
    public String getNume() {
    	return nume;
    }
    public int getVarsta() {
    	return varsta;
    }
    // Suprascrierea metodei toString
    @Override
    public String toString() {
        return "Student{nume='" + nume + "', varsta=" + varsta + "}";
    }
}
