import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio27
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a hora da chegada:");
        int hora_chegada =  teclado.nextInt();

        System.out.print("Digite o minuto da chegada:");
        int minuto_chegada =  teclado.nextInt();

        System.out.print("Digite a hora da saida:");
        int hora_saida =  teclado.nextInt();

        System.out.print("Digite os minutos da saida:");
        int minuto_saida =  teclado.nextInt();

        DecimalFormat format = new DecimalFormat("000.00");

        double valor_hora1_2 = 5;
        double valor_hora3_4 = 7.5;
        double valor_hora5_adiante = 10;

        int hora_ficou = (((hora_saida *60) + minuto_saida) - ((hora_chegada * 60 ) + minuto_chegada)) / 60;
        int minuto_ficou = hora_ficou % 60;

        if(hora_ficou < 0)
        {
            hora_ficou += 24;
        }
        if(hora_chegada >= 0 && minuto_chegada < 60 && minuto_chegada >= 0 && hora_chegada < 24 && hora_saida <24)
        {
            if(minuto_ficou >=30 || hora_ficou == 0)
            hora_ficou++;
        }
        switch (hora_ficou) {
            case 1:
            valor_hora1_2 = valor_hora1_2 * hora_ficou;
            System.out.print("R$ "+format.format(valor_hora1_2));
            break;
            case 2:
            valor_hora1_2 = valor_hora1_2 * hora_ficou;
            System.out.print("R$ "+format.format(valor_hora1_2));
            break;
            case 3:
            valor_hora3_4 = valor_hora3_4 * hora_ficou;
            System.out.print("R$ "+format.format(valor_hora3_4));
            break;
            case 4:
            valor_hora3_4 = valor_hora3_4 * hora_ficou;
            System.out.print("R$ "+format.format(valor_hora3_4));
            break;
            case 5:
            valor_hora5_adiante = valor_hora5_adiante * hora_ficou;
            System.out.print("R$ "+format.format(valor_hora5_adiante));
            break;
            default:
                System.out.print("Valores Inválidos");
            teclado.close();
        }
    }
}