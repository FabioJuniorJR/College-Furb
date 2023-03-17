/*import java.util.Scanner;
public class Problema1021
{
    public static void main(String[]args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite valor_a_usar:");
        double valor_total = teclado.nextDouble();


        double troco_nota1 = valor_total / 100;
        double resto1 = valor_total % 100;
        int teste1 = (int) troco_nota1;

        double troco_nota2 = resto1 / 50;
        double resto2 = resto1 % 50;
        int teste2 = (int) troco_nota2;

        double troco_nota3 = resto2 / 20;
        double resto3 = resto2 % 20;
        int teste3 = (int) troco_nota3;

        double troco_nota4 = resto3 / 10;
        double resto4 = resto3 % 10;
        int teste4 = (int) troco_nota4;

        double troco_nota5 = resto4 / 5;
        double resto5 = resto4 % 5; 
        int teste5 = (int) troco_nota5;

        double troco_nota6 = resto5 / 2;
        double resto6 = resto5 % 2;
        int teste6 = (int) troco_nota6;





        double troco_nota7 = resto6 / 1.00;
        double resto7 = resto6 % 1.00;
        int teste7 = (int) troco_nota7;

        double troco_nota8 = resto7 / 0.50;
        double resto8 = resto7 % 0.50;
        int teste8 = (int) troco_nota8;

        double troco_nota9 = resto8 / 0.25;
        double resto9 = resto8 % 0.25;
        int teste9 = (int) troco_nota9;

        double troco_nota10 = resto9 / 0.10;
        double resto10 = resto9 % 0.10; 
        int teste10 = (int) troco_nota10;

        double troco_nota11 = resto10 / 0.05;
        double resto11 = resto10 % 0.05;
        int teste11 = (int) troco_nota11;

        double troco_nota12 = resto11 / 0.01;
        double resto12 = resto11 % 0.01;
        int teste12 = (int) troco_nota12;

        System.out.println("NOTAS:");
        System.out.println(teste1+" nota(s) de R$ 100.00");
        System.out.println(teste2+" nota(s) de R$ 50.00");      
        System.out.println(teste3+" nota(s) de R$ 20.00");
        System.out.println(teste4+" nota(s) de R$ 10.00");
        System.out.println(teste5+" nota(s) de R$ 5.00");
        System.out.println(teste6+" nota(s) de R$ 2.00");
        

        System.out.println("MOEDAS:");
        System.out.println(teste7+" moedas(s) de R$ 1.00");
        System.out.println(teste8+" moedas(s) de R$ 0.50");
        System.out.println(teste9+" moedas(s) de R$ 0.25");
        System.out.println(teste10+" moedas(s) de R$ 0.10");
        System.out.println(teste11+" moedas(s) de R$ 0.05");
        System.out.println(teste12+" moedas(s) de R$ 0.01");
        
       

        teclado.close();
    }
}*/
import java.util.Scanner;
public class Problema1021
{
    public static void main(String[]args)
    {
        Scanner teclado = new Scanner(System.in);
        float n = teclado.nextFloat();
        int notade100reais = (int) (n / 100);
        int notade50reais = (int) ((n % 100) / 50);
        int notade20reais = (int) (((n % 100) % 50) / 20);
        int notade10reais = (int) ((((n % 100) % 50) % 20) / 10);
        int notade5reais = (int) (((((n % 100) % 50) % 20) % 10) / 5);
        int notade2reais = (int) ((((((n % 100) %50) % 20) %10) % 5) / 2);

        int moedasde1real = (int) (((((((n % 100) % 50) % 20) % 10) % 5) % 2) /1); 
        double nVezes100 = n * 100;

        int moedasde50centavos = (int) ((nVezes100 % 100) / 50);
        int moedasde25centavos = (int) (((nVezes100 % 100) % 50) / 25);
        int moedasde10centavos = (int) ((((nVezes100 % 100) % 50) % 25) / 10);
        int moedasde5centavos = (int) (((((nVezes100 % 100) % 50) % 20) % 10) / 5);
        int moedasde1centavos= (int) (((((((nVezes100 % 100) % 50) % 20) % 10) % 5) / 1));

        System.out.println("NOTAS:");
        System.out.println(notade100reais+" nota(s) de R$ 100,00");
        System.out.println(notade50reais+" nota(s) de R$ 50,00");      
        System.out.println(notade20reais+" nota(s) de R$ 20,00");
        System.out.println(notade10reais+" nota(s) de R$ 10,00");
        System.out.println(notade5reais+" nota(s) de R$ 5,00");
        System.out.println(notade2reais+" nota(s) de R$ 2,00");
        

        System.out.println("MOEDAS:");
        System.out.println(moedasde1real+" moedas(s) de R$ 1,00");
        System.out.println(moedasde50centavos+" moedas(s) de R$ 0,50");
        System.out.println(moedasde25centavos+" moedas(s) de R$ 0,25");
        System.out.println(moedasde10centavos+" moedas(s) de R$ 0,10");
        System.out.println(moedasde5centavos+" moedas(s) de R$ 0,05");
        System.out.println(moedasde1centavos+" moedas(s) de R$ 0,01");
        
        teclado.close();
        
    
    }
}




