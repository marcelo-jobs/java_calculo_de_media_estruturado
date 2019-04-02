package programtom;

import java.util.Locale;
import java.util.Scanner;

public class PograminhaTom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definindo padr�o de escrita dos USA
		Locale.setDefault(Locale.US);

		// Variables
		int nota1, nota2, qntDias;
		float mediaAluno, mediaDias;

		// M�todo Scanner para leitura de dados

		Scanner sc = new Scanner(System.in);

		// Programa

		System.out.println("Digite a 1� nota: (Padr�o: de 0 at� 100)");
		nota1 = sc.nextInt();
		System.out.println("Digite a 2� nota: (Padr�o de 0 at� 100)");
		nota2 = sc.nextInt();
		System.out.println("Digite a quantidade de dias da frequ�ncia escolar: (De 1 at� 200 dias)");
		qntDias = sc.nextInt();

		// Calcular m�dia dos alunos

		mediaAluno = (nota1 + nota2) / 2;

		// Calcular frequ�ncia do aluno em 200 dias de aula

		mediaDias = (qntDias * 100) / 200;

		//Imprime a m�dia de notas e frequ�ncia

		System.out.println("A m�dia de notas �: " + mediaAluno + " e a frequ�ncia escolar � de : " + mediaDias + "%");

		// Calculo de aprova��o ( M�dia maior que 7,5 e frequ�ncia maior ou igual a 75% )
		
		if ((mediaAluno >= 75.0) && (mediaDias >= 75)) {

			System.out.println("Parab�ns voc� foi aprovado!!");
			

		} else {
			System.out.println("Voc� reprovou! Noob !");
		}
         
		
		
	}

}
