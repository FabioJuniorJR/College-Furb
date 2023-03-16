import java.util.Scanner;
public class FabioAdrianoCorreaDeOliveiraJunior_1
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int opcao = 0;
        int num_hosp_saiu = 0;
        int num_diaria = 0;
        String nome = "";
        double valor_total_diaria = 0;
        double total_pagar = 0;
        double valor_servico = 0;

        do {
            System.out.println("_____Controle de Hóspedes_____");
            System.out.print("1. encerrar a conta de um hóspede\n2. verififcar o numero de contas encerradas\n3. sair\n__opcao:");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("_Hóspede_");
                    System.out.print("nome:");
                    nome = teclado.next();
                    System.out.print("diarias:");
                    num_diaria = teclado.nextInt();

                    if(num_diaria < 10)
                    {
                        valor_servico = num_diaria * 7.50;
                        valor_total_diaria = num_diaria * 25;
                        total_pagar = valor_servico + valor_total_diaria;
                    }
                    else{
                        if(num_diaria == 10)
                    {
                        valor_servico = num_diaria * 6.50;
                        valor_total_diaria = num_diaria * 25;
                        total_pagar = valor_servico + valor_total_diaria ;
                    }
                    else{
                        if(num_diaria > 10)
                    {
                        valor_servico = num_diaria * 5.0;
                        valor_total_diaria = num_diaria * 25;
                        total_pagar = valor_servico + valor_total_diaria ;
                    }
                }
            }
            num_hosp_saiu += 1;
                    System.out.println("______________");
                    System.out.println("nome: " + nome);
                    System.out.println("Total: " + total_pagar);
                    break;
                case 2:
                    System.out.println("Numero de contas encerradas: "+num_hosp_saiu);
                    break;
                case 3:
                    System.out.println("sair");
                    break;
                    default:
                    System.out.println("Opção errada!");
            }
            
        } while (opcao != 3);

        teclado.close();
    }
}
