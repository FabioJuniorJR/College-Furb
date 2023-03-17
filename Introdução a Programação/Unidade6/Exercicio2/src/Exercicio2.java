import java.util.Scanner;
public class Exercicio2
{
    public Exercicio2()
    {
        float vetor[] = new float[12];
        float soma = lerValoresVetor(vetor);
        float media = calculoMedia(soma, vetor.length);
        maioresMedia(vetor, media);
    }
    public float lerValoresVetor(float vetor[])
    {
        Scanner teclado = new Scanner(System.in);
        float soma = 0;

        for(int indice = 0; indice < vetor.length; indice++)
        {
        System.out.print("Digite um valor:");
        vetor[indice] = teclado.nextFloat(); 
        soma += vetor[indice];
        }
        System.out.println("A soma é: "+soma);
        teclado.close();
        return soma;
    }

    public float calculoMedia(float soma, float tamanhoVetor)
    {
        float media = 0;
        media = soma / tamanhoVetor;
        System.out.println("A media é: "+media);
        
        return media;
    }

    public void maioresMedia(float[] vetor, float media)
    {   
        float maiores = 0;
        for(int indice = 0; indice < vetor.length; indice++)
        {
            if(vetor[indice] > media)
            {
                maiores = vetor[indice];
                System.out.println("Os maiores valores que a media são: "+maiores);
            }
        }
    }
    public static void main(String[] args)
    {
        new Exercicio2();
    }
}


