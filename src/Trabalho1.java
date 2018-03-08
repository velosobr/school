import javax.swing.JOptionPane;

/**
 * @author Lino
 */
public class Trabalho1 {

	static final int linha = 4;
	static final int coluna = 3;
	static final int tamanhoVetor = 12;

	public static void main(String args[]) {
		// Entrada de dados

		double Matriz[][] = new double[linha][coluna];
		int Aux[][] = new int[linha][coluna];
		int i, j;
		// Legenda para as prateleiras
		Aux[0][0] = 1001;
		Aux[0][1] = 1002;
		Aux[0][2] = 1003;
		Aux[1][0] = 2001;
		Aux[1][1] = 2002;
		Aux[1][2] = 2003;
		Aux[2][0] = 3001;
		Aux[2][1] = 3002;
		Aux[2][2] = 3003;
		Aux[3][0] = 4001;
		Aux[3][1] = 4002;
		Aux[3][2] = 4003;

		/*
		 * 1) Solicite ao usuário a quantidade de teclados em cada compartimento
		 */
		for (i = 0; i < 4; i++) {
			for (j = 0; j < coluna; j++) {

				Matriz[i][j] = Integer.parseInt(JOptionPane
						.showInputDialog("Ola, insira a quantidade de teclados para o compartimento: " + Aux[i][j]));
			}
		}

		/*
		 * 2) João, qual eh o número total de teclados no armário?
		 */
		double somaMatriz = 0;
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				somaMatriz = somaMatriz + Matriz[i][j];
			}
		}

		JOptionPane.showMessageDialog(null, "O numero total de teclados no armario eh de: " + somaMatriz + " teclados");

		/*
		 * 3) João, o armário está desorganizado, calcule o número ideal de teclados que
		 * deveriam estar alocados em cada compartimento. (Calcule a media).
		 */

		double mediaMatriz = 0;
		mediaMatriz = somaMatriz / 12;

		JOptionPane.showMessageDialog(null,
				"O numero ideal de teclados que deveriam estar alocados em cada compartimento eh: " + mediaMatriz
						+ " ");

		/*
		 * 4) João, qual eh o número do compartimento que MAIS tem teclados
		 */

		double maiorCompartimento = 0;
		int linMaior = 0;
		int colMaior = 0;
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				if (Matriz[i][j] > maiorCompartimento) {
					maiorCompartimento = Matriz[i][j];
					linMaior = i;
					colMaior = j;
				}
			}
		}

		JOptionPane.showMessageDialog(null,
				"O numero do compartimento que mais tem teclado eh: " + Aux[linMaior][colMaior]);

		/*
		 * 5) João, qual eh o número do compartimento que MENOS tem teclados ?
		 */

		double menorCompartimento = 999999;
		int linMenor = 0;
		int colMenor = 0;
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				if (Matriz[i][j] < menorCompartimento) {
					menorCompartimento = Matriz[i][j];
					linMenor = i;
					colMenor = j;
				}
			}
		}

		JOptionPane.showMessageDialog(null,
				"O numero do compartimento que menos tem teclados eh: " + Aux[linMenor][colMenor]);

		/*
		 * 6) João, vou te dizer o número de um dos compartimentos, me diga quantos
		 * teclados tem neste compartimento. (solicite ao usuário que informe o número
		 * do compartimento e então mostre o número de teclados do mesmo)
		 */

		int consulta = Integer
				.parseInt(JOptionPane.showInputDialog("Digite o número do compartimento que você deseja consultar: "));
		int linConsulta = 0;
		int colConsulta = 0;
		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				if (consulta == Aux[i][j]) {
					linConsulta = i;
					colConsulta = j;

				}

			}
		}

		JOptionPane.showMessageDialog(null, "A quantidade de teclados encontrada no compartimento " + consulta
				+ " eh de: " + Matriz[linConsulta][colConsulta] + " teclados");

		/*
		 * 7) João, mostre todas as quantidades de teclados ordenadas. Para isso coloque
		 * todas as quantidades em um novo vetor e ordene com o BubbleSort.
		 */

		String vetorFinal = "";

		double vetorOrdenado[] = new double[tamanhoVetor], aux = 0;
		int troca = 1;
		int contAuxiliar = 0;
		for (i = 0; i < linha; i++) {

			for (j = 0; j < coluna; j++) {
				vetorOrdenado[contAuxiliar] = Matriz[i][j];
				contAuxiliar = contAuxiliar + 1;
			}
		}
		while (troca == 1) {
			troca = 0;

			for (i = 0; i < tamanhoVetor - 1; i++) {

				if (vetorOrdenado[i] > vetorOrdenado[i + 1]) {
					aux = vetorOrdenado[i];
					vetorOrdenado[i] = vetorOrdenado[i + 1];
					vetorOrdenado[i + 1] = aux;
					troca = 1;
				}

			}

		}
		for (i = 0; i < tamanhoVetor - 1; i++) {
			vetorFinal += vetorOrdenado[i] + " \n";

		}

		JOptionPane.showMessageDialog(null, "Os valores ordenados sao: \n " + vetorFinal);

		/*
		 * 8) João, mostre a porcentagem do número de compartimentos em relação ao
		 * total(12 compartimentos), que possuem mais teclados que a mehdia do armário.
		 */

		double porcent = 0, cont = 0;
		for (i = 0; i < linha; i++) {

			for (j = 0; j < coluna; j++) {
				if (Matriz[i][j] > mediaMatriz) {
					cont++;
				}

			}
		}

		porcent = (cont * 100) / 12;

		JOptionPane.showMessageDialog(null,
				porcent + "% dos compartimentos possuem mais teclados que a media do armario");

		/*
		 * 9) João mostre o número do compartimento que MENOS tem teclados na Prateleira
		 * 3.
		 */

		double menosPrat3 = 999999;
		int linMenos = 0, colMenos = 0;
		for (i = 2; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (Matriz[i][j] < menosPrat3) {
					menosPrat3 = Matriz[i][j];
					linMenos = i;
					colMenos = j;

				}
			}
		}

		JOptionPane.showMessageDialog(null,
				"O compartimento que menos tem teclados na prateleira 3 eh o: " + Aux[linMenos][colMenos]);

		/*
		 * 10) João mostre o número do compartimento que MAIS tem teclados na Prateleira
		 * 4.
		 */

		double maisPrat4 = 0;
		int linMais = 0, colMais = 0;
		for (i = 3; i < 4; i++) {
			for (j = 0; j < 3; j++) {
				if (Matriz[i][j] > maisPrat4) {
					maisPrat4 = Matriz[i][j];
					linMais = i;
					colMais = j;

				}
			}
		}

		JOptionPane.showMessageDialog(null,
				"O compartimento que mais tem teclados na prateleira 4 é o: " + Aux[linMais][colMais]);

	}
}