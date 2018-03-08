package Aula03e04prog;
//Criando e manipulando um objeto GradeBook

public class GradeBookTest4 {

	public static void main(String[] args){
	
		//Cria objetos GradeBook
		GradeBook4 gradeBook1 = new GradeBook4("Introduction to Java Language");
		GradeBook4 gradeBook2 = new GradeBook4("Human-Computer Interaction");
		
		//Valor inicial de courseName para cada GradeBook
		System.out.printf("gradeBook1 course name is: %s\n\n", 
			gradeBook1.getCourseName() );
		System.out.printf("gradeBook2 course name is: %s\n\n", 
			gradeBook2.getCourseName() );
	} //fim de main

} //fim da classe GradeBookTest
