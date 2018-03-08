package Aula05prog;

import java.util.Scanner;

public class Analysis {

	public static void main (String[] args) {
		Scanner input = new Scanner( System.in );
		//inicializando variaveis nas declaracoes
		int passes = 0; // numero de aprovacoes
		int failures = 0; // numero de reprovacoes
		int studentCounter = 1; // contador de alunos
		int result; // um resultado do exame (fornecido pelo usuario)
		
		//processa 10 alunos com o loop controlado por contador
		while ( studentCounter <= 10 ) {
			System.out.print("Enter result (1=pass, 2=fail): ");
			result = input.nextInt();
			
			// if ... else aninhado em while
			if (result == 1) // se result == 1
				passes = passes + 1; //incrementa aprovacoes
			else // caso contrario, result não for == 1
				failures = failures + 1; //incrementa reprovacoes
			
			//incrementa studentCouter até o loop terminar
			studentCounter = studentCounter + 1;
		} //fim do while
		
		//fase de termino; prepara e exibe os resultados
		System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);
		
		//determina se mais de 8 alunos foram aprovados
		if ( passes > 8 )
			System.out.println("Bonus to instructor!");
	} // fim de main
} // fim da classe Analysis