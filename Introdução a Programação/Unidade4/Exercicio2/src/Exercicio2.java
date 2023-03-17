import java.util.Scanner;
public class Exercicio2
{
    public static void main(String[]args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero:");
        int numero = teclado.nextInt();

        if (numero % 2 == 0)
        {
             System.out.println("O numero:"+numero+" é par");                                                                                   
        }
        else
        {
            System.out.println("O numero:"+numero+" é impar");
        
        }

        teclado.close();
    }
}
