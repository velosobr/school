package Aula03e04prog;
import java.util.Scanner; //importacao da classe Scanner

public class CalculadoraTest {

	//Método Principal inicia a execução do aplicativo Java
	public static void main (String[] args) {	
		//cria um Scanner para obter entrada da janela de comando
		Scanner input = new Scanner( System.in );
		
		int num1;
		int num2;
		
		System.out.print("Entre com o primeiro inteiro: ");
		num1 = input.nextInt(); //lê o primeiro inteiro fornecido pelo usuário
		
		System.out.print("Entre com o segundo inteiro: ");
		num2 = input.nextInt(); //lê o segundo inteiro fornecido pelo usuário
		
		//Cria um objeto do tipo Calculadora
		Calculadora calc = new Calculadora();

		//chamada do metodo somar
		calc.somar(num1,num2);
		
		System.out.println();
		
		//chamada do metodo subtrair
		calc.subtrair(num1,num2);
	}

} //fim da classe Calculadora