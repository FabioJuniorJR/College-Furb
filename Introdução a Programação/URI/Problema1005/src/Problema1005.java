import java.text.DecimalFormat;
import java.util.Scanner;
public class Problema1005
{
    public static void main(String []args)
    {
        DecimalFormat decimalFormat = new DecimalFormat("0.00000");
        Scanner teclado = new Scanner(System.in);

        double A = teclado.nextDouble();
        A = A*3.5f;
        double B = teclado.nextDouble();
        B = B*7.5f;
        double MEDIA = (A+B)/11;
        System.out.print("MEDIA = "+ decimalFormat.format ( MEDIA ));
        teclado.close();
        
    }
}