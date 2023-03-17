/*Leia os quatro valores correspondentes aos eixos xey de dois pontos do plano, p1 (x1, y1) e p2 (x2, y2) e calcule a distância entre eles
 mostrando quatro casas decimais após a vírgula, de acordo com a fórmula :

Distância =

Entrada
O arquivo de entrada contém duas linhas de dados. O primeiro contém dois valores duplos: x1 y1 e o segundo também contém dois valores duplos com um dígito após a vírgula decimal: x2 y2.

Resultado
Calcule e imprima o valor da distância usando a fórmula fornecida, com 4 dígitos após o ponto decimal.*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class Problema1015
{
    public static void main(String[]args)
    {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        System.out.print("Digite x1:");
        float x1 = teclado.nextFloat();

        System.out.print("Digite y1:");
        float y1 = teclado.nextFloat();

        System.out.print("Digite x2:");
        float x2 = teclado.nextFloat();

        System.out.print("Digite y2:");
        float y2 = teclado.nextFloat();
        
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));


        System.out.println(""+decimalFormat.format(distancia));
        

        teclado.close();

    }
}