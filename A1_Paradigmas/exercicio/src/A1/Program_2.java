package A1;

import java.util.Scanner;

public class Program_2 {
    
    public void main() {

		Scanner sc = new Scanner(System.in);
		Comparacao_2 comparacao = new Comparacao_2();

			System.out.println("QUESTÃO 2!!\n");

			System.out.printf("Insira o nome do funcionário numero 1:");
			comparacao.name1 = sc.nextLine();
			
			System.out.print("Insira o salário do funcionário numero 1:");
			comparacao.salario1 = sc.nextDouble();
		
			System.out.printf("Insira o nome do funcionário numero 2:");
			sc.nextLine();
			comparacao.name2 = sc.nextLine();
			
			System.out.print("Insira o salário da funcionário numero 2:");
			comparacao.salario2 = sc.nextDouble();
		
			System.out.printf("\nA média de salário dos funcionários é: " + comparacao.calcMedia());


		sc.close();
	}


}
