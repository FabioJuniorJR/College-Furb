import java.util.Scanner;
public class Exercicio1
{
    public Exercicio1()
    {
        int vetor[] = new int[10];
        lerValorVetor(vetor);
        escreverValorVetorInverso(vetor);
    }
    public void lerValorVetor(int vetor[])
    {
        Scanner teclado = new Scanner(System.in);
        for(int indice = 0; indice < vetor.length; indice++)
        {
            System.out.print("Digite um numero:");
            vetor[indice] = teclado.nextInt(); 
        }
        teclado.close();
    }
    public void escreverValorVetorInverso(int vetor[])
    {
        for(int indiceInverso = vetor.length-1; indiceInverso >= 0; indiceInverso--)
        {
            System.out.println("Vetor[" + indiceInverso + "]: " + vetor[indiceInverso]);
        }
    }
    public static void main(String[] args)
    {
        new Exercicio1();
    }
}