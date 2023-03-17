import java.util.Scanner;
public class Exercicio3
{
    public static void main(String[]args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        int numero1 = teclado.nextInt();

        System.out.print("Digite o segundo numero:");
        int numero2 = teclado.nextInt();

        if (numero1 > numero2)
        {
            System.out.println("O numero1 é o maior");
        }
        else
        {
            System.out.println("O numero2 é o maior");
        }
        teclado.close();
    }
}