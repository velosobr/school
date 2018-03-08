package Aula03e04prog;
//Criando e manipulando um objeto GradeBook
import java.util.Scanner; //importacao da classe Scanner

public class GradeBookTest3 {

	public static void main(String[] args){
	
		//cria um Scanner para obter entrada da janela de comando
		Scanner input = new Scanner( System.in );
	
		//Cria um objeto GradeBook e o atribui a myGradeBook
		GradeBook3 myGradeBook3 = new GradeBook3();
		
		System.out.printf("Initial course name is: %s\n\n", 
		   myGradeBook3.getCourseName());
		   
		System.out.println("Entre com o nome do curso: ");
		String theName = input.nextLine();
		myGradeBook3.setCourseName( theName ); //configura o nome do curso
		System.out.println(); //linha em branco
		
		//Mensagem de boas-vindas depois de especificar o nome do curso
		myGradeBook3.displayMessage();
	} //fim de main

} //fim da classe GradeBookTest