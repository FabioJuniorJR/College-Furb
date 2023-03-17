import java.util.Scanner;
public class Exercicio4
{
    public Exercicio4()
    {
        float vetor1[] = new float[10];
        float vetor2[] = new float[10];
        float vetor3[] = new float[10];
        lerValoresVetor(vetor1, vetor2);
        somaValoresVetores(vetor1, vetor2, vetor3);
        escreverValoresSomados(vetor3);
    }                              
    public void lerValoresVetor(float vetor1[], float vetor2[])
    {
        Scanner teclado = new Scanner(System.in);
        for(int indice = 0; indice < vetor1.length; indice++)
        {
        System.out.print("Digite um numero para vetor1:");
        vetor1[indice] = teclado.nextFloat();
        }
        for(int indice = 0; indice < vetor2.length; indice++)
        {
        System.out.print("Digite um numero para vetor2:");
        vetor2[indice] = teclado.nextFloat();
        }
        teclado.close();
    }

    public void somaValoresVetores(float vetor1[], float vetor2[], float vetor3[])
    {
        for(int indice = 0; indice < vetor3.length; indice++)
        {
            vetor3[indice] = vetor1[indice] + vetor2[indice];
        }
    }

    public void escreverValoresSomados(float vetor3[])   
    {
        System.out.println("Vetor[" + 0 + "]: " + vetor3[0]);
        System.out.println("Vetor[" + 1 + "]: " + vetor3[1]);
        System.out.println("Vetor[" + 2 + "]: " + vetor3[2]);
        System.out.println("Vetor[" + 3 + "]: " + vetor3[3]);
        System.out.println("Vetor[" + 4 + "]: " + vetor3[4]);
        System.out.println("Vetor[" + 5 + "]: " + vetor3[5]);
        System.out.println("Vetor[" + 6 + "]: " + vetor3[6]);
        System.out.println("Vetor[" + 7 + "]: " + vetor3[7]);
        System.out.println("Vetor[" + 8 + "]: " + vetor3[8]);
        System.out.println("Vetor[" + 9 + "]: " + vetor3[9]);
    }   
    public static void main(String[] args)
    {
        new Exercicio4();
    }
}  


