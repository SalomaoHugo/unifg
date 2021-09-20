package A1;

import java.util.Scanner;

public class Program_3 {

    public void main() {

		Scanner sc = new Scanner(System.in);
		Retangulo_3 retangulo = new Retangulo_3();

		System.out.println("QUESTÃO 3!!\n");

		System.out.print("insira tamanho e altura do retangulo\n");

		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();

			
		System.out.printf("O valor da àrea é: " + retangulo);
		System.out.printf("\nO valor do perímetro é: " + retangulo.calcPeri());
		System.out.printf("\nO valor da diagonal é: " + retangulo.calcDiagonal());
	

		sc.close();
	}
}
