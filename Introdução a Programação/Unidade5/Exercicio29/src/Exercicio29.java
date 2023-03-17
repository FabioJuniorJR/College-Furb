import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        double valor = 0;
        double quant_nota1 = 0;
        double quant_nota2 = 0;
        double quant_nota5 = 0;
        double quant_nota10 = 0;
        double quant_nota20 = 0;
        double novo_valor = 0;
        String add_valor = "";

        System.out.print("Deseja digitar um valor:");
        add_valor = teclado.next();
        System.out.print("Digite um valor:");
        double valor_inicial = teclado.nextDouble();

        while (add_valor.equalsIgnoreCase("sim"))
        {
            while(valor_inicial >= 20)
            {
                valor_inicial -= 20;
                quant_nota20 += 1;
            }
            while(valor_inicial >= 10)
            {
                valor_inicial -= 10;
                quant_nota10 += 1;
            }
            while(valor_inicial >= 5)
            {
                valor_inicial -= 5;
                quant_nota5 += 1;
            }
            while(valor_inicial >= 2)
            {
                valor_inicial -= 2;
                quant_nota2 += 1;
            }
            while(valor_inicial >= 1)
            {
                valor_inicial -= 1;
                quant_nota1 += 1;
            }
            System.out.println("Troco de: "+ quant_nota20 + " notas de 20");
            System.out.println("Troco de: "+quant_nota10 + " notas de 10");
            System.out.println("Troco de: "+quant_nota5 + " notas de 5");
            System.out.println("Troco de: "+quant_nota2 + " notas de 2");
            System.out.println("Troco de: "+quant_nota1 + " notas de 1");

            System.out.println("Fim" + "\n");

            System.out.println("Deseja digitar um valor:");
            add_valor = teclado.next();
            System.out.println("Digite um valor:");
            valor = teclado.nextDouble();
        }
        teclado.close();
    }

}