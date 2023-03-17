import java.util.Scanner;
public class Problema1007
 {
    public static void main(String[]args)
    {
      Scanner teclado = new Scanner(System.in);
      int A = teclado.nextInt();
      int B = teclado.nextInt();
      int C = teclado.nextInt();
      int D = teclado.nextInt();
      int DIFERENCA = A*B-C*D;
      System.out.print("DIFERENCA = "+DIFERENCA);
      teclado.close();
      

    }
}
