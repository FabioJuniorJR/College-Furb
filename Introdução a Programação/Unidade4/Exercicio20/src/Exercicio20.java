import java. text.DecimalFormat;
import java.util.Scanner;
public class Exercicio20
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da nota 1:");
        int nota_prova1 =  teclado.nextInt();

        System.out.print("Digite o valor da nota 2:");
        int nota_prova2 =  teclado.nextInt();

        System.out.print("Digite o valor da nota 3:");
        int nota_prova3 =  teclado.nextInt();

        System.out.print("Digite o valor da nota dos exercicios:");
        int nota_exercicios =  teclado.nextInt();

        DecimalFormat format = new DecimalFormat("0.00");

        double media = (nota_prova1 + nota_prova2 * 2 + nota_prova3 * 3 + nota_exercicios)/7;

        if(media >= 9)
        {
            System.out.print("A média é: " + media +" - Conceito A");
        }
        else{
            if(media >= 7.5 && media < 9)
            {
                System.out.print("A média é: " + media +" - Conceito B");
            }
            else{
                if(media >= 6 && media < 7.5)
                {
                    System.out.println("A média é: "+format.format(media)+" - Conceito C");
                }
                else{
                    if(media >= 4 && media < 6)
                    {
                        System.out.println("A média é: " + media +" - Conceito D");
                    }
                    else{
                        if(media < 4)
                        {
                            System.out.println("A média é: " + media +" - Conceito E");
                        }
                    }
                }
            }
        }

         teclado.close();
    }
}
