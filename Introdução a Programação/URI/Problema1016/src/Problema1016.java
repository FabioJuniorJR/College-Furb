/*Dois carros (X e Y) partem na mesma direção. O carro X sai com uma velocidade constante de 60 km / h e o carro Y sai com uma velocidade constante de 90 km / h.

Em uma hora (60 minutos) o carro Y pode distanciar-se 30 quilômetros do carro X, ou seja, pode se afastar um quilômetro a cada 2 minutos.

Leia a distância (em km) e calcule quanto tempo leva (em minutos) para o carro Y percorrer essa distância em relação ao outro carro.

Entrada
O arquivo de entrada contém 1 valor inteiro.

Resultado
Imprima o tempo necessário seguido da mensagem "minutos" que significa minutos em português.
import java.util.Scanner;
public class Problema1016
{
    public static void main(String[]args)
    {
        Scanner teclado = new Scanner(System.in);      
        System.out.print("Digite n:");
        int distancia = teclado.nextInt();     
        int seg = distancia % 3600;
        int min = distancia / 60;
        int horas = min / 60;
        min = min % 60;    
        System.out.println(min+" minutos");
        teclado.close();
    }
}*/

 /*System.out.println(y_velocidade + " " + "minutos");*/


import java.util.Scanner;
public class Problema1016
 {
    public static void main(String[] args)
     {
        Scanner teclado = new Scanner(System.in); 
        int x_velociodade = 60; /* km/h */
        int y_velocidade = 90;  /* km/h */

        System.out.println("digite o time");
        int time = teclado.nextInt();

        y_velocidade = time * 2;
        System.out.println(y_velocidade + " minutos");
        teclado.close();

    }
}
