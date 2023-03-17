import java.util.Scanner;
public class Exercicio19
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de X:");
        int valor_x =  teclado.nextInt();

        System.out.print("Digite o valor de Y:");
        int valor_y =  teclado.nextInt();

        if(valor_x == 0 && valor_y == 0)
        {
            System.out.println("Quadrante 0: " + "Y:"+valor_x + " X:" + valor_y);
        }
        else{
            if(valor_x >= 1 && valor_y >= 1)
            {
                System.out.println("Quadrante 1: " + "Y:"+valor_x + " X:" + valor_y);
            }
            else{
                if(valor_x >= 1 && valor_y < 1)
                {
                    System.out.println("Quadrante 2: " + "Y:"+valor_x + " X:" + valor_y);
                }
                else{
                    if(valor_x < 0 && valor_y < 0)
                    {
                        System.out.println("Quadrante 3: " + "Y:"+valor_x + " X:" + valor_y);
                    }
                    else{
                        if(valor_x < 0 && valor_y >= 1)
                        {
                            System.out.println("Quadrante 4: " + "Y:" + valor_x + " X:" + valor_y);
                        }
                    }
                }
            }
        }

        teclado.close();
    }
}

