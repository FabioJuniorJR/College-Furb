import java.util.Scanner;
public class Exercicio1_Problema1041
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        float x =  teclado.nextFloat();

        System.out.print("Digite um numero: ");
        float y =  teclado.nextFloat();

        if(x > 0 && y > 0)
        {
            System.out.println("Q1");
        }
        else{
            if(y > 0 && x < 0)
            {
                System.out.println("Q2");
            }
            else{
                if(y < 0 && x < 0)
                {
                    System.out.println("Q3");
                }
                else{
                    if(y < 0 && x > 0)
                    {
                        System.out.println("Q4");
                    }
                    else{
                        if(x == 0 && y == 0)
                        {
                            System.out.println("Origem");
                        }
                        else{
                            if(x > 0 || x < 0 && y == 0)
                            {
                                System.out.println("Eixo X");
                            }
                            else{
                                if(y > 0 || y < 0 && x == 0)
                                {
                                    System.out.println("Eixo Y");
                                }
                            }
                        }
                    }
                }
            }
        }

        teclado.close();
    }
}