package A1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int opc; 

        System.out.println("QUESTÕES DISPONÍVEIS!!\n");

        System.out.println("[1] - Questão 1 - Mais Velha \n");
        System.out.println("[2] - Questão 2 - Salário Médio \n");
        System.out.println("[3] - Questão 3 - Retangulo \n");
        System.out.println("[4] - Questão 4 - Aumento Salário \n");
        System.out.println("[5] - Questão 5 - Nota Alunos \n");

        System.out.println("Defina qual o exercício desejado: \n");
        opc = sc.nextInt();

        

        switch (opc) {
            case 1:  
            Program_1 program_1 = new Program_1();
            program_1.main();
            break;
            case 2:  
            Program_2 program_2 = new Program_2();
            program_2.main();
            break;
            case 3:  
            Program_3 program_3 = new Program_3();
            program_3.main();
            break;
            case 4:  
            Program_4 program_4 = new Program_4();
            program_4.main();
            break;
            case 5:  
            Program_5 program_5 = new Program_5();
            program_5.main();
            break;
            default:
                System.out.println("Opção inválida.");
        }

        sc.close();

    }
    
}
