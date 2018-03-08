package Aula03e04prog;
//Declaracao de classe com uma variavel de instancia
// courseName e dois métodos para configurar e obter seu valor
// e um construtor com um argumento

public class GradeBook4 {

	//Variavel de instancia que guarda o nome do curso
	private String courseName;
	
	//O construtor inicializa courseName com o argumento String
	public GradeBook4(String name) {
		courseName = name; //inicializa courseName
	} //fim do construtor
	
	//Metodo para configurar o nome do curso
	public void setCourseName(String name) {
		courseName = name; //armazena o nome do curso
	} //fim do metodo setCourseName
	
	//metodo para recuperar o nome do curso
	public String getCourseName() {
		return courseName;
	} //fim do metodo getCourseName

	// Exibe uma mensagem de boas-vindas ao usuario com o nome do curso
	public void displayMessage() {
		System.out.printf("Welcome to the Grade Book for \n%s!\n", getCourseName());
	}//fim do método displayMessage
	
}//fim da classe GradeBook