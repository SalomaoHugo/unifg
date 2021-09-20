package A1;

public class Student_5 {

	String name;
	double nota1, nota2, nota3;
	
	public double calcNota() {
		
		return nota1 + nota2 + nota3;
	}
	
	public double analise() {
		return 60 - calcNota();
	}
	
}
