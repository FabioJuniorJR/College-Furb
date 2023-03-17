import java.util.Scanner;
public class Exercicio7
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        double maior = 0;
        double menor = 0;
        int cont = 0;

        System.out.println("Digite um valor n_int:");
        int n_int =  teclado.nextInt();

        for(cont = 0; cont < 5; cont++)
        {
            System.out.println("Digite um valor n_real:");
        double n_real =  teclado.nextDouble();

            if(cont == 0)
            {
                if(n_real > n_int)
                {
                    maior = n_real;
                    //System.out.println(maior);
                }
                else
                {
                    menor = n_int;
                   //System.out.println(menor);
                }
            }
            if(cont > 0)
            {
                if(n_real > maior)
                {
                    maior = n_real;
                    //System.out.println(maior);
                }
                else{
                    menor = n_real;
                    //System.out.println(menor);
                }
            }
            System.out.println("O maior vale: "+maior);
            System.out.println("O menor vale: "+menor);

            teclado.close();
        }
    }
}


       
