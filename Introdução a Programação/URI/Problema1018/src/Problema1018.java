import java.text.DecimalFormat;
import java.util.Scanner;
public class Problema1018
{
    public static void main(String[]args)
    {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0");

        System.out.println("Digite valor_a_usar:");
        int valor_a_usar = teclado.nextInt();

        int troco_nota1 = valor_a_usar / 100;
        int resto1 = valor_a_usar % 100;

        int troco_nota2 = resto1 / 50;
        int resto2 = resto1 % 50;

        int troco_nota3 = resto2 / 20;
        int resto3 = resto2 % 20;

        int troco_nota4 = resto3 / 10;
        int resto4 = resto3 % 10;

        int troco_nota5 = resto4 / 5;
        int resto5 = resto4 % 5; 

        int troco_nota6 = resto5 / 2;
        int resto6 = resto5 % 2;

        int troco_nota7 = resto6 / 1;
        int resto7 = resto6 % 1;

        System.out.println(""+valor_a_usar);
        System.out.println(decimalFormat.format(troco_nota1)+" nota(s) de R$ 100,00");
        System.out.println(decimalFormat.format(troco_nota2)+" nota(s) de R$ 50,00");
        System.out.println(decimalFormat.format(troco_nota3)+" nota(s) de R$ 20,00");
        System.out.println(decimalFormat.format(troco_nota4)+" nota(s) de R$ 10,00");
        System.out.println(decimalFormat.format(troco_nota5)+" nota(s) de R$ 5,00");
        System.out.println(decimalFormat.format(troco_nota6)+" nota(s) de R$ 2,00");
        System.out.println(decimalFormat.format(troco_nota7)+" nota(s) de R$ 1,00");

        teclado.close();
    }
}