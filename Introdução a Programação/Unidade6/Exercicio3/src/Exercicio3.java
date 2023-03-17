import java.util.Scanner;
public class Exercicio3
{
    public Exercicio3()
    {
        float vetor[] = new float[12];
        lerValores(vetor);
        ajustarImpares(vetor);
        ajustarPares(vetor);
        vetorAtualizadoResultante(vetor);
    }
    public void lerValores(float vetor[])
    {
        Scanner teclado = new Scanner(System.in);
        for(int indice = 0; indice < vetor.length; indice++)
        {
            System.out.print("Digite um valor:");
            vetor[indice] = teclado.nextFloat();
        }
        teclado.close();
    }

    public void ajustarImpares(float vetor[])
    {
        float acrescimo = 0;             

        acrescimo = (vetor[1] * 5) /100;
        vetor[1] += acrescimo;
        acrescimo = (vetor[3] * 5) /100;
        vetor[3] += acrescimo;
        acrescimo = (vetor[5] * 5) /100;
        vetor[5] += acrescimo;
        acrescimo = (vetor[7] * 5) /100;
        vetor[7] += acrescimo;
        acrescimo = (vetor[9] * 5) /100;
        vetor[9] += acrescimo;
        acrescimo = (vetor[11] * 5) /100;
        vetor[11] += acrescimo;

}

    public void ajustarPares(float vetor[])
    {
        float acrescimo = 0;             
                                       
        acrescimo = (vetor[0] * 2) /100;
        vetor[0] += acrescimo;
        acrescimo = (vetor[2] * 2) /100;
        vetor[2] += acrescimo;
        acrescimo = (vetor[4] * 2) /100;
        vetor[4] += acrescimo;
        acrescimo = (vetor[6] * 2) /100;
        vetor[6] += acrescimo;
        acrescimo = (vetor[8] * 2) /100;
        vetor[8] += acrescimo;
        acrescimo = (vetor[10] * 2) /100;
        vetor[10] += acrescimo;

    }

    public void vetorAtualizadoResultante(float vetor[])
    {
        System.out.println("Vetor[" + 0 + "]: " + vetor[0]);
        System.out.println("Vetor[" + 1 + "]: " + vetor[1]);
        System.out.println("Vetor[" + 2 + "]: " + vetor[2]);
        System.out.println("Vetor[" + 3 + "]: " + vetor[3]);
        System.out.println("Vetor[" + 4 + "]: " + vetor[4]);
        System.out.println("Vetor[" + 5 + "]: " + vetor[5]);
        System.out.println("Vetor[" + 6 + "]: " + vetor[6]);
        System.out.println("Vetor[" + 7 + "]: " + vetor[7]);
        System.out.println("Vetor[" + 8 + "]: " + vetor[8]);
        System.out.println("Vetor[" + 9 + "]: " + vetor[9]);
        System.out.println("Vetor[" + 10 + "]: " + vetor[10]);
        System.out.println("Vetor[" + 11 + "]: " + vetor[11]);
    }

    public static void main(String[] args)
    {
        new Exercicio3();
    }
}