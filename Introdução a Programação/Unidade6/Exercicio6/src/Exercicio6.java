import java.util.Scanner;

public class Exercicio6
{

    public Exercicio6()
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor: ");
        int quant_Vetor = teclado.nextInt();
        double vetor[] = new double[quant_Vetor];

        vetorLer(vetor, teclado);
        if (vetorPesquisar(vetor, teclado))
        {
            System.out.println("Encontrou o valor");
        }
        else{
            System.out.println("Não encontrou o valor");
        }

        teclado.close();
    }

    public void vetorLer(double vetor[], Scanner teclado)
    {
        for (int i = 0; i < vetor.length; i++)
        {
            System.out.println("vetor[" + i + "]: ");
            vetor[i] = teclado.nextDouble();
        }
    }

    public boolean vetorPesquisar(double vetor[], Scanner teclado)
    {
        System.out.println("Informe um valor de pesquisa: ");
        double valorPesquisa = teclado.nextDouble();
        for (int indice = 0; indice < vetor.length; indice++)
        {
            if (valorPesquisa == vetor[indice])
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        new Exercicio6();
    }

}