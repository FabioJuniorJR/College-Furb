import java. text.DecimalFormat;
import java.util.Scanner;
public class Exercicio21
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a massa em gramas:");
        double massa =  teclado.nextDouble();

        System.out.print("Digite a altura em metros:");
        double altura =  teclado.nextDouble();

        DecimalFormat format = new DecimalFormat("00.0");
        
        double imc = massa / Math.pow(altura,2);

        if(imc < 18.5)
        {
            System.out.print("Magreza: "+format.format(imc));
        }
        else{
            if(imc >= 18.5 && imc <=24.9)
            {
                System.out.print("Saudavel: "+format.format(imc));
            }
            else{
                if(imc >= 25  && imc <= 29.9)
                {
                    System.out.print("Sobrepeso: "+format.format(imc));
                }
                else{
                    if(imc >= 30   && imc <= 34.9)
                    {
                        System.out.print("Obesidade Grau 1: "+format.format(imc));
                    }
                    else{
                        if(imc >= 35   && imc <= 39.9)
                        {
                            System.out.print("Obesidade Grau 2(Severa): "+format.format(imc));
                        }
                        else{
                            if(imc >= 40)
                            {
                                System.out.print("Obesidade Grau 3(Mórbida): "+format.format(imc));
                            }
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}
