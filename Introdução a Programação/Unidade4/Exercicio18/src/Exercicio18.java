import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio18
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o dia do vencimento:");
        int dia_vencimento =  teclado.nextInt();

        System.out.print("Digite o dia do pagamento:");
        int dia_pagamento =  teclado.nextInt();

        System.out.print("Digite o valor da prestação:");
        int valor_prestacao =  teclado.nextInt();

        DecimalFormat format = new DecimalFormat("0.00");

        if(dia_pagamento < dia_vencimento)
        {
            System.out.println("Recebera 10% de desconto, pagamento esta em dia");
            double valor_pago = valor_prestacao - (valor_prestacao * 0.10);
            System.out.println("valor pago: R$ "+format.format(valor_pago));
        }
        else{
            if(dia_pagamento > 10 && dia_pagamento < 15 && dia_vencimento == 10 )
            {
            System.out.println("Não recebera desconto, pagamento esta atrasado");
            double valor_pago = valor_prestacao;
            System.out.println("valor pago: R$ "+format.format(valor_pago));
            }
            else{
                if(dia_vencimento == 10 && dia_pagamento > 15  )
                {
                System.out.print("Digite o total de dias atrasado:");
                int dias_atrasado =  teclado.nextInt();
                System.out.println("Recebera multa de 2% por dia atrasado");
                double valor_pago = valor_prestacao + (dias_atrasado * 0.20);
                System.out.println("valor pago: R$ "+format.format(valor_pago));
                }

        teclado.close();
            }
        }
    }
}
