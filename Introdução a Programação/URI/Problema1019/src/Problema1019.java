/*import java.util.Scanner;
public class Problema1019 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();
       
        int horas = valor / 3600;
        int restoHoras = valor % 3600;
       
        int minutos = restoHoras / 60;
        int restoMinutos = restoHoras % 60;
       
        int segundos = restoMinutos;
        System.out.printf("%d:%d:%d", horas, minutos, segundos);

    }

}*/
import java.util.Scanner;
public class Main
{
     public static void main(String[]args)
     {
         Scanner entrada = new Scanner(System.in);
         int n = entrada.next.int;
         int segundos = n % 60;
         int minutos = n / 60;
         int horas = minutos / 60;
         minutos %= 60;
         System.out.println(horas + ":" + minutos + ":" + segundos);
         entrada.close();
     }
}