import java.util.Scanner;
public class Exercicio3
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        double divisor = 1;
        double soma = 0;

            for(double dividendo = 1; dividendo <= 100; dividendo++){
                soma += divisor / dividendo;
            }
            System.out.println(soma);

         teclado.close();
     }
}