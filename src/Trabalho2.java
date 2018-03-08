import javax.swing.JOptionPane;

public class Trabalho2 {

	static class Clientes {
		int codigoPesquisa; // código do cliente
		String nome; // nome do cliente
		int tempo_fidelidade; // tempo de fidelidade em ANOS
		int cia_aerea; // número de cia_aerea
		double milhas; // Total de milhas acumuladas

	}

	static Clientes C[] = new Clientes[3]; // vetor do tipo Cliente
	static int numeroPesquisa;

	public static void main(String[] args) {

		boolean verifica = true;
		do {
			int controle = Integer.parseInt(JOptionPane.showInputDialog("Menu de clientes. \n"
					+ "1  - Solicitar dados de todos os Clientes. \n"
					+ "2  - Mostrar nome e código de todos os clientes. \n"
					+ "3  - Mostrar todos os dados de um determinado cliente solicitando seu código. \n"
					+ "4  - Calcular o valor das Milhas Promocionais do cliente solicitando seu código. \n"
					+ "5  - Mostrar o valor das Milhas já Utilizadas pelo cliente(cálculo simulado) solicitando seu código. \n"
					+ "6  - Calcular o valor do Total de Milhas movimentadas pelo cliente solicitando seu código.\n"
					+ "7  - Calcular o valor do Saldo de Milhas do cliente solicitando seu código. \n"
					+ "8  - Calcular a soma de todas a milhas distribuidas pelo plano(milhas acumuladas + milhas promocionais). \n"
					+ "9  - Calcular a soma de todas a milhas promocionais distribuidas nesta promoção. \n"
					+ "10 - Apresentar um resumo de cálculos de um determinado cliente solicitando seu código. \n"
					+ "11 - Sair"));

			switch (controle) {
			case 1:
				cadastrar();
				break;
			case 2:
				JOptionPane.showMessageDialog(null, mostrar());
				break;
			case 3:
				numeroPesquisa = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cliente"));

				JOptionPane.showMessageDialog(null, codigoPesquisa(numeroPesquisa));

				break;
			case 4:
				numeroPesquisa = Integer.parseInt(JOptionPane
						.showInputDialog("Digite o código do cliente para mostrar suas milhas promocionais"));
				JOptionPane.showMessageDialog(null,
						"O valor das milhas promocionais é: " + calMilhasPromocionais(numeroPesquisa));

				break;
			case 5:
				numeroPesquisa = Integer.parseInt(
						JOptionPane.showInputDialog("Digite o código do cliente para mostrar suas milhas utilizadas"));
				JOptionPane.showMessageDialog(null,
						"O valor das milhas utilizadas é: " + calcularMilhasUtilizada(numeroPesquisa));

				break;
			case 6:
				numeroPesquisa = Integer.parseInt(JOptionPane.showInputDialog(
						"Digite o código do cliente para calcular" + " \n o total de milhas movimentadas por ele"));
				JOptionPane.showMessageDialog(null,
						"O valor do Total de Milhas movimentadas pelo cliente é: " + totalMilhas(numeroPesquisa));

				break;
			case 7:
				numeroPesquisa = Integer.parseInt(JOptionPane
						.showInputDialog("Digite o código do cliente para calcular o valor do saldo de milhas"));
				JOptionPane.showMessageDialog(null, "O valor do saldo de milhas é: " + saldoMilhas(numeroPesquisa));
				break;
			case 8:
				JOptionPane.showMessageDialog(null,
						"A soma de todas a milhas distribuidas pelo plano é: " + milhasDistribuidas());
				break;
			case 9:
				JOptionPane.showMessageDialog(null,
						"A soma de todas a milhas promocionais distribuidas nesta promoção é: "
								+ totalGeralPromocional());
				break;
			case 10:
				numeroPesquisa = Integer.parseInt(
						JOptionPane.showInputDialog("Digite o código do cliente para mostrar um resumo geral"));

				JOptionPane.showMessageDialog(null, resumoCalculos(numeroPesquisa));
				break;

			case 11:
				verifica = false;
				break;
			}

		} while (verifica);

	}

	// DICA BALA

	public static int pesquisa(int numeroPesquisa) {
		int posicao = 0;
		for (int i = 0; i < C.length; i++) {
			if (numeroPesquisa == C[i].codigoPesquisa) {
				posicao = i;
			}
		}
		return posicao;
	}

	// 1) Solicitar dados de todos os Clientes.

	public static void cadastrar() {
		for (int i = 0; i < C.length; i++) {
			C[i] = new Clientes();
			C[i].codigoPesquisa = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o código do " + (i + 1) + "º cliente"));
			C[i].nome = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º cliente");
			C[i].tempo_fidelidade = Integer
					.parseInt(JOptionPane.showInputDialog("Digite o tempo de fidelidade (em anos)"));
			C[i].cia_aerea = Integer.parseInt(JOptionPane.showInputDialog("Digite a Cia Área"));
			C[i].milhas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de milhas"));

		}
	}

	// 2) Mostrar nome e código de todos os clientes.

	public static String mostrar() {
		String todosClientes = "";
		for (int i = 0; i < C.length; i++) {
			todosClientes += "\n" + "Código do cliente: " + C[i].codigoPesquisa + "\n" + "Nome: " + C[i].nome + "\n"
					+ "Tempo de Fidelidade (em anos): " + C[i].tempo_fidelidade + "\n" + "Cia Aérea: " + C[i].cia_aerea
					+ "\n" + "Milhas: " + C[i].milhas + "\n";

		}

		return todosClientes;

	}

	/*
	 * 3) Mostrar todos os dados de um determinado cliente solicitando seu código.
	 */
	public static String codigoPesquisa(int numeroPesquisa) {
		String todos = "";

		todos = "\n" + "Código do cliente: " + C[pesquisa(numeroPesquisa)].codigoPesquisa + "\n" + "Nome: "
				+ C[pesquisa(numeroPesquisa)].nome + "\n" + "Tempo de fidelidade: "
				+ C[pesquisa(numeroPesquisa)].tempo_fidelidade + "\n" + "Cia Aérea: "
				+ C[pesquisa(numeroPesquisa)].cia_aerea + "\n" + "Milhas acumuladas: "
				+ C[pesquisa(numeroPesquisa)].milhas;

		return todos;
	}

	/*
	 * 4) Calcular o valor das Milhas Promocionais do cliente solicitando seu
	 * código.
	 */
	public static double calMilhasPromocionais(int numeroPesquisa) {

		double totalPromocional = 0.0;

		if (C[pesquisa(numeroPesquisa)].cia_aerea == 1 || C[pesquisa(numeroPesquisa)].cia_aerea == 2) {

			totalPromocional = (0.10 * C[pesquisa(numeroPesquisa)].milhas);

		} else if (C[pesquisa(numeroPesquisa)].cia_aerea > 2) {

			totalPromocional = (0.05 * C[pesquisa(numeroPesquisa)].milhas);

		} else if (C[pesquisa(numeroPesquisa)].tempo_fidelidade > 2) {

			totalPromocional = C[pesquisa(numeroPesquisa)].milhas + 1500;

		}

		return totalPromocional;

	}

	/*
	 * 5) Mostrar o valor das Milhas já Utilizadas pelo cliente(cálculo simulado)
	 * solicitando seu código.
	 */
	public static double calcularMilhasUtilizada(int numeroPesquisa) {

		double milhaUtilizada = 0.0;
		if (C[pesquisa(numeroPesquisa)].milhas >= 5000) {
			milhaUtilizada = (0.15 * C[pesquisa(numeroPesquisa)].milhas);

		} else {
			milhaUtilizada = (0.08 * C[pesquisa(numeroPesquisa)].milhas);
		}

		return milhaUtilizada;
	}

	/*
	 * 6) Calcular o valor do Total de Milhas movimentadas pelo cliente solicitando
	 * seu código.
	 */

	public static double totalMilhas(int numeroPesquisa) {
		double somaMilhas = 0.0;
		somaMilhas = C[pesquisa(numeroPesquisa)].milhas + calMilhasPromocionais(numeroPesquisa);
		return somaMilhas;
	}

	/*
	 * 7) Calcular o valor do Saldo de Milhas do cliente solicitando seu código.
	 */

	public static double saldoMilhas(int numeroPesquisa) {
		double saldo = 0.0;
		saldo = totalMilhas(numeroPesquisa) - calcularMilhasUtilizada(numeroPesquisa);
		return saldo;
	}

	/*
	 * 8) Calcular a soma de todas a milhas distribuidas pelo plano(milha acumuladas
	 * + milhas promocionais)
	 */

	public static double milhasDistribuidas() {
		double milhasAcumuladas = 0.0, milhasTotais = 0.0;

		for (int i = 0; i < C.length; i++) {
			milhasAcumuladas += C[i].milhas;

		}
		milhasTotais = totalGeralPromocional() + milhasAcumuladas;

		return milhasTotais;
	}

	/*
	 * 9) Calcular a soma de todas a milhas promocionais distribuidas nesta
	 * promoção.
	 */
	public static double totalGeralPromocional() {
		double totalPromocional = 0.0;

		for (int i = 0; i < C.length; i++) {

			if (C[i].cia_aerea == 1 || C[i].cia_aerea == 2) {

				totalPromocional += (0.10 * C[i].milhas) + C[i].milhas;
			} else if (C[i].cia_aerea > 2) {

				totalPromocional += (0.05 * C[i].milhas) + C[i].milhas;
			} else if (C[i].tempo_fidelidade > 2) {
				totalPromocional += C[i].milhas + 1500;
			}

		}

		return totalPromocional;
	}

	/*
	 * 10)Apresentar um resumo de cálculos de um determinado cliente solicitando seu
	 * código.
	 */

	public static String resumoCalculos(int numeroPesquisa) {
		String resumo = "";
		resumo = "" + codigoPesquisa(numeroPesquisa) + "\n O valor das milhas utilizadas é: "
				+ calcularMilhasUtilizada(numeroPesquisa) + "\n Milhas Promocionais: "
				+ calMilhasPromocionais(numeroPesquisa) + "\n Total de milhas: " + totalMilhas(numeroPesquisa)
				+ "\n Saldo de milhas: " + saldoMilhas(numeroPesquisa);
		return resumo;
	}
}
