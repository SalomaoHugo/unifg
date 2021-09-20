package A1;
import java.util.Scanner;

public class Program_4 {

	public void main() {
		

		System.out.println("QUESTÃO 4!!\n");

		Scanner sc = new Scanner (System.in);
		Employee_4 employee = new Employee_4();
		
		System.out.println("Digite o nome do Funcionário");
		employee.name = sc.nextLine();
		
		System.out.println("Digite o valor do seu salário");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Digite o valor do imposto");
		employee.tax = sc.nextDouble();
		
		System.out.println ("employee: " + employee);
		
		System.out.println("insira a porcentagem de acrescimo:");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println ("employee: " + employee);
		
		
		sc.close();
	}

}