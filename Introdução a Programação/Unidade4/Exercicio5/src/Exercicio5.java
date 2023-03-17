import java.util.Scanner;
public class Exercicio5
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("A cor é azul?");
        boolean resposta = teclado.nextBoolean();

        if(!resposta)
        {
            System.out.println("Não");
        }
        else{
        System.out.println("Sim");

        teclado.close();
        }
    }
}