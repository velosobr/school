package Aula03e04prog;
//Criando e manipulando um objeto GradeBook
import java.util.Scanner; //importacao da classe Scanner

public class Exercicio3Test {

	public static void main(String[] args){
	
		//cria um Scanner para obter entrada da janela de comando
		Scanner input = new Scanner( System.in );
	
		//Cria um objeto GradeBook e o atribui a myGradeBook
		Exercicio3 gradeBook = new Exercicio3();
				   
		System.out.println("Entre com o nome do curso: ");
		String theName = input.nextLine();
		gradeBook.setCourseName( theName ); //configura o nome do curso
		System.out.println(); //linha em branco
		System.out.println("Entre com o nome do professor: ");
		String theProfessor = input.nextLine();
		gradeBook.setProfessorName( theProfessor ); //configura o nome do professor do curso
		
		//Mensagem de boas-vindas depois de especificar o nome do curso
		gradeBook.displayMessage();
	} //fim de main

} //fim da classe GradeBookTest