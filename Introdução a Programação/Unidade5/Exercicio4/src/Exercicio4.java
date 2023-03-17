import java.util.Scanner;
public class Exercicio4
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        double numerador = 3;
        double dividendo = 2;
        double apoio = 4;
        double soma = 0;

        for(int contador = 1; contador < 20; contador++)
        {
            soma = soma + (numerador / dividendo);
            dividendo = dividendo + apoio;
            apoio = apoio + 2;
            numerador = numerador + 2;
        }
        System.out.println(soma);

        teclado.close();
    }
}















/*double soma = 0;
double numerador = 3;
double denominador = 2;
double apoio = 4;
for (int count = 0; count < 20; count++) { //20 primeiros numeros

    soma = soma + (numerador / denominador);
    
    numerador += 2;
    denominador += apoio;
    apoio += 2;            
}
System.out.println("A soma é: "+soma);

teclado.close();
    }
}*/