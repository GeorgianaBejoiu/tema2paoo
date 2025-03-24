package homework119;



public class Student {

	String nume;
	int nota;
	
	public Student(String nume, int nota)
	{
		this.nume=nume;
		this.nota=nota;
	}
	
	 @Override
	    public String toString() {
	        return nume + " - Nota: " + nota;
	    }
	}


