import java.util.Scanner;
public class Exercicio7
{

    public Exercicio7()
    {
        Scanner teclado = new Scanner(System.in);
        int vetQtd;
        do {
            System.out.println("Informe qtd. vetor: ");
            vetQtd = teclado.nextInt();
        } while (vetQtd < 1 || vetQtd > 20);

        int vet[] = new int[vetQtd];

        vetInserir(vet, teclado);
        vetOrdenar(vet);
        vetImprimir(vet);

        teclado.close();
    }

    public void vetInserir(int vet[], Scanner teclado) {
        int valor = 0;
        System.out.println("Informe vet[" + 0 + "]:  ");
        valor = teclado.nextInt();
        vet[0] = valor;
        int posFim = 1;

        while (posFim < vet.length) {
            System.out.println("Informe vet[" + posFim + "]:  ");
            valor = teclado.nextInt();
            int j = 0;
            while (j < posFim) {
                if (valor == vet[j]) {
                    break;
                }
                j++;
            }
            if (j == posFim) { // inseriu
                vet[posFim] = valor;
                posFim++;
            }
        }
    }

    public void vetOrdenar(int vet[]) {
        int bolha;
        for (int indice = 0; indice < vet.length - 1; indice++) {
            if (vet[indice] > vet[indice + 1]) {
                bolha = vet[indice];
                vet[indice] = vet[indice + 1];
                vet[indice + 1] = bolha;
                indice = -1;
            }
        }
    }

    public void vetImprimir(int vet[])
    {
        for (int indice = 0; indice < vet.length; indice++)
        {
            System.out.println("vet[" + indice + "]: " + vet[indice]);
        }
    }

    public static void main(String[] args) {
        new Exercicio7();
    }

}