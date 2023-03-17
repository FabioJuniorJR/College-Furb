import java.text.DecimalFormat;
import java.util.Scanner;
public class Main
 {
    public static void main(String[]args)
    {
      DecimalFormat decimalFormat = new DecimalFormat("00.00");
      Scanner teclado = new Scanner(System.in);
      int numfunc = teclado.nextInt();   
      int quant_horas_trab = teclado.nextInt();
      double valor_horas_trab = teclado.nextDouble();
      double salario = quant_horas_trab * valor_horas_trab;
      System.out.println("NUMBER = "+numfunc);
      System.out.println("SALARY = U$ "+decimalFormat.format(salario));
      teclado.close();


    }
}
