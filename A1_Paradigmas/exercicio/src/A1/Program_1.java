package A1;

import java.util.Scanner;

public class Program_1 {
    
    public void main() {

		Scanner sc = new Scanner(System.in);
		Comparacao_1 comparacao = new Comparacao_1();

			System.out.println("QUESTÃO 1!!\n");

			System.out.printf("Insira o nome da pessoa numero 1:");
			comparacao.name1 = sc.nextLine();
			
			System.out.print("Insira a idade da pessoa numero 1:");
			comparacao.idade1 = sc.nextDouble();
		
			System.out.printf("Insira o nome da pessoa numero 2:");
			sc.nextLine();
			comparacao.name2 = sc.nextLine();
			
			System.out.print("Insira a idade da pessoa numero 2:");
			comparacao.idade2 = sc.nextDouble();
		
			System.out.printf("\nA pessoa com a maior idade é: " + comparacao);


		sc.close();
	}


}
