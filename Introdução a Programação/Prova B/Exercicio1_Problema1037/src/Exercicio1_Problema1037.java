import java.util.Scanner;
public class Exercicio1_Problema1037
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        float numero =  teclado.nextFloat();

        if(numero >= 0 && numero <= 25 )
        {
            System.out.print("Intervalo [0,25]");
        }
        else{
            if(numero > 25 && numero <= 50)
            {
                System.out.print("Intervalo (25,50]");
            }
            else{
                if(numero > 50 && numero <= 75)
                {
                    System.out.print("Intervalo (50,75]");
                }
                else{
                    if(numero > 75 && numero <= 100)
                    {
                        System.out.print("Intervalo(75,100]");
                    }
                    else{
                        System.out.print("Fora de intervalo");
                    }
                }
            }
        }
        teclado.close();
    }
}
