/*Faça um programa que leia três valores de ponto flutuante: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem base A e altura C.
b) a área do círculo do raio C. (pi = 3,14159)
c) a área do trapézio que tem A e B pela base e C pela altura.
d) a área do quadrado que possui o lado B.
e) a área do retângulo que possui os lados A e B.

Entrada
O arquivo de entrada contém três valores duplos com um dígito após a vírgula decimal.    base maior mais base menor vezes altura dividido por 2

Resultado
O arquivo de saída deve conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com 
uma mensagem correspondente (em português) e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após a vírgula. */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Problema1012
{
    public static void main(String[]args)
    {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        System.out.print("Digite A:");
        float A = teclado.nextFloat();

        System.out.print("Digite B:");
        float B = teclado.nextFloat();

        System.out.print("Digite C:");
        float C = teclado.nextFloat();
        
        double area_triangulo_retangulo  = (A*C)/2;
        double area_círculo = 3.14159*Math.pow(C,2); 
        double area_trapézio = (A+B)*C/2;  
        double area_quadrado = B*B;
        double area_retângulo = A*B; 


        System.out.println("A area do triangulo vale: "+decimalFormat.format(area_triangulo_retangulo));
        System.out.println("A area do circulo vale: "+decimalFormat.format(area_círculo ));
        System.out.println("A area do trapezio vale: "+decimalFormat.format(area_trapézio));
        System.out.println("A area do quadrado vale: "+decimalFormat.format( area_quadrado));
        System.out.println("A area do retangulo vale: "+decimalFormat.format(area_retângulo));


        teclado.close();

    }
}