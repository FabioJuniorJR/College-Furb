import java.util.Scanner;
public class Exercicio1
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        for(int quantidade = 0; quantidade < 5; quantidade++){
            System.out.print("Digite um numero: ");
            int numero = teclado.nextInt();

            if(numero % 2 == 0)
            {
                System.out.println("Par");
            }
            else{
                System.out.println("Impar");
            }
        }

        teclado.close();
    }
}
