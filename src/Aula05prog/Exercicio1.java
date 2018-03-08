package Aula05prog;

import java.util.Scanner;


public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		double km = 1.0;
		double litros = 0.0;
		double sumKm =0.0, sumLitros=0.0;
		int qtdAbastecimento = 0;
		
		while (km != 0.0){
			System.out.println("Entre com a KM ou 0 para sair.");
			km = input.nextDouble();
			input.nextLine();
			if (km != 0.0) {
				qtdAbastecimento++;
				System.out.println("");
				System.out.println("Entre com os litros usados.");
				litros = input.nextDouble();
				input.nextLine();
				sumKm += km;
				sumLitros += litros;
				
				System.out.printf("Você rodou: %.2f km e abasteceu: %.2f l, sua media de km/l é igual a %f\n\n", km, litros, km/litros);
			}
		}
		if (sumLitros != 0.0)
			System.out.printf("Você rodou um total de %.2f km e abasteceu um total de %.2f l por %d vezes, "
					+ "sua media de km/l é igual a %.2f", sumKm, sumLitros, qtdAbastecimento, sumKm/sumLitros);
		
		input.close();

	}

}
