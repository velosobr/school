package Aula03e04prog;
import java.util.Scanner; //importacao da classe Scanner

public class EmployeeTest {

	public static void main(String[] args){
	
		//cria um Scanner para obter entrada da janela de comando
		Scanner input = new Scanner( System.in );
		
		Employee e1 = new Employee();
		System.out.println("Entre com o primeiro nome do empregado: ");
		String first = input.nextLine();
		e1.setFirstName(first);
		
		System.out.println("Entre com o sobrenome do empregado: ");
		String sur = input.nextLine();
		e1.setSurname(sur);
		
		System.out.println("Entre com o salario do empregado: ");
		double sal = input.nextDouble();
		e1.setSalary(sal);
		input.nextLine();
		
		
		Employee e2 = new Employee();
		
		System.out.println("Entre com o primeiro nome do empregado 2: ");
		String first2 = input.nextLine();
		e2.setFirstName(first2);
		
		System.out.println("Entre com o sobrenome do empregado 2: ");
		String sur2 = input.nextLine();
		e2.setSurname(sur2);
		
		System.out.println("Entre com o salario do empregado 2: ");
		double sal2 = input.nextDouble();
		e2.setSalary(sal2);
		input.nextLine();
		
		System.out.println();
		System.out.println();
		
		System.out.printf("O salario do funcionario %s %s eh igual a: %.2f\n\n", 
			e1.getFirstName(), e1.getSurname(), e1.getSalary()*12);
		System.out.printf("O salario do funcionario %s %s eh igual a: %.2f\n\n", 
			e2.getFirstName(), e2.getSurname(), e2.getSalary()*12);
			
		double salE1 = e1.getSalary();
		e1.setSalary(salE1*1.1);
		double salE2 = e2.getSalary();
		e2.setSalary(salE2*1.1);
		
		System.out.printf("O NOVO salario do funcionario %s %s eh igual a: %.2f\n\n", 
			e1.getFirstName(), e1.getSurname(), e1.getSalary());
		System.out.printf("O NOVO salario do funcionario %s %s eh igual a: %.2f\n\n", 
			e2.getFirstName(), e2.getSurname(), e2.getSalary());
		
	}
}