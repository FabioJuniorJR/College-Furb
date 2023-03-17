import java.util.Scanner;
public class Exercicio13
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero da carta 1:");
        int carta1 = teclado.nextInt();

        System.out.print("Digite o numero da carta 2:");
        int carta2 =  teclado.nextInt();
                                                                                                                          
        System.out.print("Digite o numero da carta 3:");
        int carta3 =  teclado.nextInt();

        int cartas_boas = 0;

        if(carta1 == 1 || carta1 ==2 || carta1 == 3)
        {
            cartas_boas += 1;
        }
        if(carta2 == 1 || carta2 ==2 || carta2 == 3)
        {
            cartas_boas += 1;
        }
        if(carta3 == 1 || carta3 ==2 || carta3 == 3)
        {
            cartas_boas += 1;
        }

        if(cartas_boas == 1)
        {
            System.out.println("TRUCO");
        }
        else{
            if(cartas_boas == 2)
            {
                System.out.println("SEIS"); 
            }
            else{
                if(cartas_boas == 3)
                {
                    System.out.println("NOVE"); 
                }

        teclado.close();
            }
        }
    }
}

        /*if(carta1 == 1 || carta1 == 2 || carta1 == 3)
        {
            System.out.println("TRUCO");
        }
        else{
        if(carta2 == 1 || carta2 == 2 || carta2 == 3)
        {
                System.out.println("TRUCO");
        }
        else{
        if(carta3 == 1 || carta3 == 2 || carta3 == 3)
        {
            System.out.println("TRUCO");
        }
        else{
        if(carta2 == 1 || carta2 == 2 || carta2 == 3)
        {
            System.out.println("TRUCO");
        }
        else{
            if(carta3 == 1 || carta3 == 2 || carta3 == 3)
            {
                System.out.println("TRUCO");
            }
        else{
        if(carta1 == 1 || carta1 == 2 || carta1 == 3 &&  carta2 == 1 || carta2 == 2 || carta2 == 3 && carta3 == 7 || carta3 == 11 || carta3 == 12 || carta3 == 13 )
        {
            System.out.println("SEIS");
        }
        if(carta1 == 1 || carta1 == 2 || carta1 == 3 &&  carta3 == 1 || carta3 == 2 || carta3 == 3 && carta2 == 7 || carta2 == 11 || carta2 == 12 || carta2 == 13 )
        {
            System.out.println("SEIS");
        }
        if(carta2 == 1 || carta2 == 2 || carta2 == 3 &&  carta3 == 1 || carta3 == 2 || carta3 == 3 && carta1 == 7 || carta1 == 11 || carta1 == 12 || carta1 == 13 )
        {
            System.out.println("SEIS");
        }
        else{
        if(carta1 == 1 || carta1 == 2 || carta1 == 3 && carta2 == 1 || carta2 == 2 || carta2 == 3 && carta3 == 1 || carta2 == 2 || carta1 == 3)
        {
            System.out.println("NOVE");
        }

        teclado.close();
                           } 
                        }
                    }
                }
            }
        }
    }
}*/