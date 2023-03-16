import java.util.Scanner;
public class FabioAdrianoCorreaDeOliveiraJunior_2
{
    FabioAdrianoCorreaDeOliveiraJunior_2()
    {
        Scanner teclado = new Scanner(System.in);
        final int vetorTamanho = 5;
        int vetor1[] = new int[vetorTamanho];
        int vetor2[] = new int[vetorTamanho];
        int vetorSoma[] = new int[vetorTamanho];
        vetor1Ler(vetor1, "Vetor1", teclado);
        vetor2Ler(vetor2, "Vetor2", teclado);
        vetorSomaCruzada(vetor1, vetor2, vetorSoma);
        vetorEscrever(vetorSoma);

        teclado.close();
    }
        private void vetor1Ler(int vetor1[], String Vetor1 , Scanner teclado)
        {
            int numero_Localizacao_vetor1 = 0;
            System.out.println("__Leitura do Vetor1__");
            for(int indice = 0; indice < vetor1.length; indice++)
            {
                System.out.print("Vetor1["+numero_Localizacao_vetor1+"]:");
                vetor1[indice] = teclado.nextInt();
                numero_Localizacao_vetor1 += 1;
            }
        }
        private void vetor2Ler(int vetor2[], String Vetor2, Scanner teclado)
        {
            int numero_Localizacao_vetor2 = 0;
            System.out.println("__Leitura do Vetor2__");
            for(int indice = 0; indice < vetor2.length; indice++)
            {
                System.out.print("Vetor2["+numero_Localizacao_vetor2+"]:");
                vetor2[indice] = teclado.nextInt();
                numero_Localizacao_vetor2 += 1;
            }
        }
        public void vetorSomaCruzada(int vetor1[], int vetor2[], int vetorSoma[])
        {
            int numero_localizacao_vetor1 = 0;
            int numero_localizacao_vetor2 = 4;
            for(int indice = 0; indice < vetorSoma.length; indice++)
            {
                vetorSoma[indice] = vetor1[numero_localizacao_vetor1] + vetor2[numero_localizacao_vetor2];
                numero_localizacao_vetor1 += 1;
                numero_localizacao_vetor2 -= 1;
            }
        }
        public void vetorEscrever(int vetorSoma[])
        {
            System.out.println("__Resultado da Soma__");
            for(int indice = 0; indice < vetorSoma.length; indice++)
            {
                System.out.println("VetorSoma["+indice+"]: "+vetorSoma[indice]);
            }
        }
    public static void main(String[] args)
    {
        new FabioAdrianoCorreaDeOliveiraJunior_2();
    }
}