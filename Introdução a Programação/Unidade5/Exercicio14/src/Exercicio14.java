import java.util.Scanner;
public class Exercicio14
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int quant_lucro_me10 = 0;
        int quant_lucro_mai10mei20 = 0;
        int quant_lucro_ma20 = 0;
        double soma_PC_merc = 0;
        double soma_PV_merc = 0;
        double lucro = 0;

        for (int cont = 0; cont < 2; cont++)
        {
            System.out.print("Digite o nome da mercadoria:");
            String nome = teclado.next();
            System.out.print("Digite o preço da compra (PC):");
            double PC = teclado.nextDouble();
            System.out.print("Digite o preço da venda (PV):");
            Double PV = teclado.nextDouble();

            soma_PC_merc += PC;
            soma_PV_merc += PV;
            double PL = (PV - PC) / PC * 100;

            if (PL < 10)
            {
                quant_lucro_me10 += 1;
            }
            else{
                if (PL >= 10 && PL <= 20)
                {
                    quant_lucro_mai10mei20 += 1;
                }
                else{
                    if (PL > 20)
                    {
                        quant_lucro_ma20 += 1;
                    }
                }
                // System.out.print("O percentual de lucro (PC) do(a) "+nome+" é: "+PL+"
                // %"+"\n"+"\n");
            }
        }
        lucro = soma_PV_merc - soma_PC_merc;

        System.out.println("Qunatidade de mercadoria com lucro maior que 10%:" + quant_lucro_me10);
        System.out.println("Qunatidade de mercadoria com lucro maior que 10% e menor que 20%:" + quant_lucro_mai10mei20);
        System.out.println("Qunatidade de mercadoria com lucro maior que 20%:" + quant_lucro_ma20);
        System.out.println("Soma dos precos das compras:" + soma_PC_merc); 
        System.out.println("Soma dos precos da venda:" + soma_PV_merc); 
        System.out.println("O lucro total é:" + lucro); 
        teclado.close();
    }
}