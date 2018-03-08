package Aula03e04prog;
//Criando um objeto GradeBook e chamando o seu metodo displayMessage.

import java.util.Scanner; //importacao da classe Scanner

public class Exercicio1 {

	public static void main(String[] args){
	
		//cria um Scanner para obter entrada da janela de comando
		Scanner input = new Scanner( System.in );
		
		System.out.println("Entre com o nome do curso: ");
		String name = input.nextLine();
	
		//Cria um objeto GradeBook e o atribui a myGradeBook
		GradeBook2 myGradeBook2 = new GradeBook2();
		
		//Chama o método displayMessage com um parametro
		myGradeBook2.displayMessage(name);
	} //fim de main

} //fim da classe GradeBookTest