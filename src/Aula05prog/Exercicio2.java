package Aula05prog;

import java.util.Scanner;


public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		int qtd = 0;
		int numero, saldo, limite, debit, credit;
		
		//Quantidade de clientes
		while (qtd < 10) {
			//Ler o número da conta
			System.out.println("Numero da conta: ");
			numero = input.nextInt();
			
			//leitura do saldo inicial
			System.out.println("Saldo no inicio do mes: ");
			saldo = input.nextInt();
			//Quebra de linha
			System.out.println("");
			
			//leitura do limite de credito
			System.out.println("Limite de crédito: ");
			limite = input.nextInt();
			//Quebra de linha
			System.out.println("");
			
			//Criacao de nova conta com numero, saldo inicial e limite de credito
			Account client = new Account (numero, saldo, limite);
			
			//leitura do total de despesas
			System.out.println("Total de itens cobrados: ");
			debit = input.nextInt();
			//Quebra de linha
			System.out.println("");
			
			//leitura do total de credito
			System.out.println("Total de creditos aplicados: ");
			credit = input.nextInt();
			//Quebra de linha
			System.out.println("");
			
			//calcular o novo saldo
			client.calcularNovoSaldo(debit, credit);
			
			//Apresentacao do novo saldo
			System.out.printf("O novo saldo do cliente é = %d\n\n", client.getBalance());
			client.calcularLimite(); //verifica se o limite foi excedido
			
		}
		input.close();

	}

}
