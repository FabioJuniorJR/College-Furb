import java.util.Scanner;

public class Exercicio10 {

	private Exercicio10() {
		Scanner teclado = new Scanner(System.in);
		int vet[] = new int[50];
		int posFim = 0; 

		int opcao;
		do {
			System.out.println(" ___ MENU ___");
			System.out.println("  1 – Incluir valor");
			System.out.println("  2 – Pesquisar valor");
			System.out.println("  3 – Alterar valor");
			System.out.println("  4 – Excluir valor");
			System.out.println("  5 – Mostrar valores");
			System.out.println("  6 – Ordenar valores");
			System.out.println("  7 – Sair do sistema");
			System.out.print(" Opção: ");
			opcao = teclado.nextInt();
			switch (opcao) {
				case 1:
					posFim = valorIncluir(vet, posFim, teclado);
					break;
				case 2:
					valorPesquisar(vet, posFim, teclado);
					break;
				case 3:
					valorAlterar(vet, posFim, teclado);
					break;
				case 4:
					posFim = valorExcluir(vet, posFim, teclado);
					break;
				case 5:
					valorMostrar(vet, posFim);
					break;
				case 6:
					valorOrdenar(vet, posFim);
					break;
				case 7:
					System.out.println(" _ FIM _ ");
					break;
				default:
					System.out.println(" .. opção inválida .. ");
					break;
			}
		} while (opcao != 7);
	}

	public int valorIncluir(int vet[], int posFim, Scanner teclado) {
		if (posFim < vet.length) {
			System.out.print(" valor: ");
			vet[posFim] = teclado.nextInt();
			posFim++;
			System.out.println("_ incluído em vet[" + posFim + "].");
		} else {
			System.out.println(" .. não incluído - vetor cheio .. ");
		}
		return posFim;
	}

	public int valorPesquisar(int vet[], int posFim, Scanner teclado) {
		System.out.print(" valor pesquisa: ");
		int valor = teclado.nextInt();
		for (int indice = 0; indice < posFim; indice++) {
			if (valor == vet[indice]) {
				System.out.println("_ encontrado vet[" + indice + "]");
				return indice;
			}
		}
		System.out.println("_ Não encontrado.");
		return -1;
	}

	public void valorAlterar(int vet[], int posFim, Scanner teclado) {
		int valorId = valorPesquisar(vet, posFim, teclado);
		if (valorId != -1) {
			System.out.print(" valor troca: ");
			vet[valorId] = teclado.nextInt();
			System.out.println("_ valor troca vet[" + valorId + "]: " + vet[valorId]);
		}
	}

	public int valorExcluir(int vet[], int posFim, Scanner teclado) {
		int valorId = valorPesquisar(vet, posFim, teclado);
		if (valorId != -1) {
			for (int indice = valorId; indice < (posFim - 1); indice++) {
				vet[indice] = vet[indice + 1];
			}
			posFim--;
			System.out.println("_ valor excluído.");
		}
		return posFim;
	}

	public void valorMostrar(int vet[], int posFim) {
		System.out.println(" _ vetor valores _ ");
		for (int indice = 0; indice < posFim; indice++) {
			System.out.println("vet[" + indice + "] " + vet[indice]);
		}
	}

	public void valorOrdenar(int vet[], int posFim) {
		int bolha;
		for (int indice = 0; indice < posFim - 1; indice++) {
			if (vet[indice] > vet[indice + 1]) {
				bolha = vet[indice];
				vet[indice] = vet[indice + 1];
				vet[indice + 1] = bolha;
				indice = -1;
			}
		}
		System.out.println("_ valores ordenados.");
	}

	public static void main(String[] args) {
		new Exercicio10();
	}

}