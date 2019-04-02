package programtom;

import java.util.Locale;
import java.util.Scanner;

public class PograminhaTom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definindo padrão de escrita dos USA
		Locale.setDefault(Locale.US);

		// Variables
		int nota1, nota2, qntDias;
		float mediaAluno, mediaDias;

		// Método Scanner para leitura de dados

		Scanner sc = new Scanner(System.in);

		// Programa

		System.out.println("Digite a 1º nota: (Padrão: de 0 até 100)");
		nota1 = sc.nextInt();
		System.out.println("Digite a 2º nota: (Padrão de 0 até 100)");
		nota2 = sc.nextInt();
		System.out.println("Digite a quantidade de dias da frequência escolar: (De 1 até 200 dias)");
		qntDias = sc.nextInt();

		// Calcular média dos alunos

		mediaAluno = (nota1 + nota2) / 2;

		// Calcular frequência do aluno em 200 dias de aula

		mediaDias = (qntDias * 100) / 200;

		//Imprime a média de notas e frequência

		System.out.println("A média de notas é: " + mediaAluno + " e a frequência escolar é de : " + mediaDias + "%");

		// Calculo de aprovação ( Média maior que 7,5 e frequência maior ou igual a 75% )
		
		if ((mediaAluno >= 75.0) && (mediaDias >= 75)) {

			System.out.println("Parabéns você foi aprovado!!");
			

		} else {
			System.out.println("Você reprovou! Noob !");
		}
         
		
		
	}

}
