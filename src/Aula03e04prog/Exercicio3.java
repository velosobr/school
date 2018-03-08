package Aula03e04prog;
//Declaracao de classe com uma variavel de instancia
// courseName e dois métodos para configurar e obter seu valor

public class Exercicio3 {

	//Variavel de instancia que guarda o nome do curso
	private String courseName;
	//Variavel de instancia que guarda o nome do curso
	private String professorName;
	
	//Metodo para configurar o nome do curso
	public void setCourseName(String name) {
		courseName = name; //armazena o nome do curso
	} //fim do metodo setCourseName
	
	//metodo para recuperar o nome do curso
	public String getCourseName() {
		return courseName;
	} //fim do metodo getCourseName
	 
	//Metodo para configurar o nome do professor do curso
	public void setProfessorName(String pName) {
		professorName = pName; //armazena o nome do professor do curso
	} //fim do metodo setProfessorName
	
	//metodo para recuperar o nome do professor do curso
	public String getProfessorName() {
		return professorName;
	} //fim do metodo getProfessorName

	// Exibe uma mensagem de boas-vindas ao usuario com o nome do curso
	public void displayMessage() {
		System.out.printf("Welcome to the Grade Book for \n%s!\n\n", 
		getCourseName());
		System.out.printf("Este curso é ministrado por \n%s!\n", 
		getProfessorName());
	}//fim do método displayMessage
	
}//fim da classe GradeBook