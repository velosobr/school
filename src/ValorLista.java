/*
 * Faça um programa que leia N valores inteiros e armazene em um vetor de
 * tamanho 100. Sendo que X deve ser menor que 100.
 */

import javax.swing.JOptionPane;

public class ValorLista {

	static int lista[] = new int[5];

	static int quantidade = 0;

	public static void main(String[] args) {

		boolean verifica = true;
		do {
			int controle = Integer.parseInt(JOptionPane
					.showInputDialog("LISTA \n" + "1  - inserir um elemento ao ﬁnal   \n" + "2  - Inserir um valor na lista \n"
							+ "3  - Visualiza os valores da lista \n" + "4  -  \n" + "5  -  \n" + "6  -  \n"
							+ "7  -  \n" + "8  -  \n" + "9  -  \n" + "10 -  \n"
							+ "11 - Sair"));

			switch (controle) {
			case 1:
				inserirUltima(3);
				break;
			case 2:
				inserir();
				break;
			case 3:
				visualizar();
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;

			case 11:
				verifica = false;
				break;
			}

		} while (verifica);

	}

	/*
	 * 1) Crie uma sub-rotina para inserir um elemento ao ﬁnal do vetor acima;
	 */
	public static void inserirUltima(int valor) {

		if (quantidade < lista.length) {
			lista[quantidade] = valor;
			quantidade++;
		} else {
			JOptionPane.showMessageDialog(null, "A lista esta cheia");
		}

	}

	public static void inserir() {

		for (int i = 0; i < lista.length; i++) {
			lista[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Digite a quantidade do valor " + i));

		}
	}

	public static void visualizar() {
		for (int i = 0; i < lista.length; i++) {
			JOptionPane.showMessageDialog(null, lista[i]);
		}
	}

}