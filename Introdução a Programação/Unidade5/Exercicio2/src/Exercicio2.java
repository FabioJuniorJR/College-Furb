import java.util.Scanner;
public class Exercicio2
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        int soma_par = 0;
        int soma_impar = 0;

            for(int numero = 1; numero < 100; numero++){

            if(numero % 2 == 0)
            {
                soma_par = soma_par + numero;
            }
            else{
                soma_impar = soma_impar + numero;
            }
        }
        System.out.println("A soma dos pares são: "+soma_par);
        System.out.println("A soma dos impares são: "+soma_impar);

            teclado.close();
        }
    }  
