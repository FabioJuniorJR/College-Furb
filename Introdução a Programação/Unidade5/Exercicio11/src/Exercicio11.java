import java.util.Scanner;
public class Exercicio11
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        int amount_broken_cookies = 0;

        for(int cont = 0; cont < 16; cont++)//16 horas, usar 5 para teste
        {
            if(cont == 0)
            {
                amount_broken_cookies = 1;
            }
            else{
                if(cont > 0)
                {
                    amount_broken_cookies = amount_broken_cookies * 3;
                }
            }

        teclado.close();
        }
        System.out.println("No final de cada dia são quebrados no total: "+amount_broken_cookies+" cookies");
    }
}