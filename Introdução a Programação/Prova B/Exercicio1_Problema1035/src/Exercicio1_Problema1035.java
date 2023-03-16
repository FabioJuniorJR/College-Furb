import java.util.Scanner;
public class Exercicio1_Problema1035
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor A:");
        int valorA =  teclado.nextInt();

        System.out.print("Digite o valor B:");
        int valorB =  teclado.nextInt();

        System.out.print("Digite o valor C:");
        int valorC =  teclado.nextInt();

        System.out.print("Digite o valor D:");
        int valorD =  teclado.nextInt();

        int somaC_D = valorC + valorD;

        int somaA_B = valorA + valorB; 

        if(valorB > valorC && valorD > valorA && somaC_D > somaA_B && valorC > 0 && valorD > 0 && valorA % 2 == 0)
        {
        System.out.println("Valores Aceitos");
        }
        else{
            System.out.println("Valores não aceitos");
        }

        teclado.close();
    }
}



















































import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int valorA =  teclado.nextInt();
        int valorB =  teclado.nextInt();
        int valorC =  teclado.nextInt();
        int valorD =  teclado.nextInt();
        int somaC_D = valorC + valorD;
        int somaA_B = valorA + valorB; 
        if(valorB > valorC && valorD > valorA && somaC_D > somaA_B && valorC > 0 && valorD > 0 && valorA % 2 == 0)
        {
        System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }
        teclado.close();
    }
}

