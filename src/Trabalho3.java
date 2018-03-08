/*
 * 1) Solicitar Nome e escrever no arquivo.
2) Solicitar uma posição do arquivo(número da linha, exemplo linha 0) e mostrar o Nome dessa
posição.
3) Solicitar um nome e informar qual a posição dentro do arquivo.
4) Solicitar um Nome e inserir na segunda posição do arquivo (linha 1).
5) Mostre todas as posições e nomes em apenas uma mensagem.
6) Sair
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Trabalho3 {
	static final String NOME_ARQUIVO = "NOMES.TXT";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean verifica = true;
		do {
			int controle = Integer
					.parseInt(JOptionPane
							.showInputDialog("Menu de clientes. \n"
									+ "1) Solicitar Nome e escrever no arquivo. \n"
									+ "2) Solicitar uma posição do arquivo(número da linha, exemplo linha 0) e mostrar o Nome dessa posição. \n "
									+ "3) Solicitar um nome e informar qual a posição dentro do arquivo. \n"
									+ "4) Solicitar um Nome e inserir na segunda posição do arquivo (linha 1). \n"
									+ "5) Mostre todas as posições e nomes em apenas uma mensagem.\n"
									+ "6 - Sair"));

			switch (controle) {
			case 1:
				solicitaNome();
				break;
			case 2:
				int posicao = Integer
						.parseInt(JOptionPane
								.showInputDialog("Digite o numero da posição que você deseja verificar o nome"));
				JOptionPane.showMessageDialog(null, "O nome inscrito na posição  "+posicao+ "é: "+posicaoNome(posicao));
				break;
			case 3:
				String nomePosicao = JOptionPane.showInputDialog(null,
						"Insira o nome que deseja descobrir a posição");
				JOptionPane.showMessageDialog(null, " A posição do nome "
						+ nomePosicao + " é: " + retornaPosicao(nomePosicao));

				break;
			case 4:
				String segundaPosicao = JOptionPane.showInputDialog(null,
						"Insira um novo nome para ser inserido na segunda posição do arquivo");
	
				break;
			case 5:
				JOptionPane.showMessageDialog(null,
						"As posições e nomes são: \n " + mostrar());
				break;

			case 6:
				verifica = false;
				break;
			}

		} while (verifica);

	}

	// 1) Solicitar Nome e escrever no arquivo.
	public static void solicitaNome() {

		try {
			BufferedWriter nomes = null;
			String adicionar = JOptionPane
					.showInputDialog("Adicionar novos dados no arquivo existente? (S/N)");

			if (adicionar.equalsIgnoreCase("S")) {
				// Abre o arquivo completando o que ja existe nele
				nomes = new BufferedWriter(new FileWriter(
						new File(NOME_ARQUIVO), true));
			} else {
				// Abre o arquivo zerando o seu conteudo
				nomes = new BufferedWriter(new FileWriter(
						new File(NOME_ARQUIVO)));
			}

			String nome = JOptionPane
					.showInputDialog("Digite um nome ou ENTER para sair");
			while (!nome.equals("")) {
				nomes.write(nome);
				nomes.newLine();
				nome = JOptionPane
						.showInputDialog("Digite um nome ou ENTER para sair");
			}
			nomes.close();

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"Não abriu arquivo para escrita!");
		}
	}

	// 2) Solicitar uma posição do arquivo(número da linha, exemplo linha 0) e
	// mostrar o Nome dessa posição.
	public static String posicaoNome(int posicao) {

		String returnSearchNome = "", posicaoLinha = "";
		int aux = 0;

		try {

            BufferedReader NOMES = new BufferedReader(new FileReader(NOME_ARQUIVO));

			while ((posicaoLinha = NOMES.readLine()) != null) {
				if (posicao == aux) {
					returnSearchNome = posicaoLinha;
					break;
				}
				aux++;
			}

			NOMES.close();

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"Não foi possivel ler o arquivo!");
		}
		return returnSearchNome;
	}

	// 3)Solicitar um nome e informar qual a posição dentro do arquivo.
	public static int retornaPosicao(String nomePosicao) {

		int posicaoArquivo = 0, aux = 0;

		String posicao = "";

		try {

			BufferedReader NOMES = new BufferedReader(new FileReader(
					NOME_ARQUIVO));

			while ((posicao = NOMES.readLine()) != null) {
				if (nomePosicao.equalsIgnoreCase(posicao)) {
					posicaoArquivo = aux;
					break;
				}
				aux++;
			}

			NOMES.close();

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"Não foi possivel ler o arquivo!");
		}

		return posicaoArquivo;
	}

	
	
	
	// 5) Mostre todas as posições e nomes em apenas uma mensagem.

	// comentar sobre laço que se formou
	public static String mostrar() {
		String todasPosicao = "";

		try {

			FileReader NOMES = new FileReader(NOME_ARQUIVO);
			BufferedReader aux1 = new BufferedReader(NOMES);

			String nome = "";
			int aux = 0;

			while ((nome = aux1.readLine()) != null) {
				todasPosicao += "# O NOME  É: " + nome
						+ ", E A POSIÇÃO É: " + aux + "\n\n";
				aux++;
			}
		     
			NOMES.close();
			aux1.close();

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"Não foi possivel ler o arquivo!");
		}

		return todasPosicao;

	}

}