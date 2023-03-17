import java.util.Scanner;
public class Exercicio12
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        int num = 1;

        System.out.println("Digite um numero inteiro: ");
        int numero = teclado.nextInt();
        for(int indice = 0; indice < numero; indice++)
        {
            for(int ind = 0; ind < indice; ind++)
            {
                System.out.print(num + "");
                num++;
            }
            System.out.println();
        }
        teclado.close();
    }
}