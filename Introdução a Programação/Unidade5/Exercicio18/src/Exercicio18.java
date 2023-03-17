import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int canal = 0;
        int total_canais = 4;
        int TV_desligada = 0;
        int quantidadeCanal_4 = 0;
        int quantidadeCanal_5 = 0;
        int quantidadeCanal_9 = 0;
        int quantidadeCanal_12 = 0;
        double perct_aud_canal4 = 0;
        double perct_aud_canal5 = 0;
        double perct_aud_canal9 = 0;
        double perct_aud_canal12 = 0;

        System.out.print("Informe o canal: ");
        canal = teclado.nextInt();

        while (canal != 0)
        {
            if (canal == 4)
            {
                quantidadeCanal_4 += 1;
            }
            else {
                if (canal == 5)
                {
                    quantidadeCanal_5 += 1;
                }
                else {
                    if (canal == 9)
                    {
                        quantidadeCanal_9 += 1;
                    }
                    else {
                        if (canal == 12)
                         {
                            quantidadeCanal_12 += 1;
                        }
                        else{
                            TV_desligada = 0;
                        }
                    }
                }
            }
            System.out.print("Informe o canal: ");
        canal = teclado.nextInt();
        }

        perct_aud_canal4 = (quantidadeCanal_4 * 100) / 4;
        perct_aud_canal5 = (quantidadeCanal_5 * 100) / 4;
        perct_aud_canal9 = (quantidadeCanal_9 * 100) / 4;
        perct_aud_canal12 = (quantidadeCanal_12 * 100) / 4;

        System.out.println("O percentual de audiencia do canal 4 foi: " + perct_aud_canal4);
        System.out.println("O percentual de audiencia do canal 5 foi: " + perct_aud_canal5);
        System.out.println("O percentual de audiencia do canal 9 foi: " + perct_aud_canal9);
        System.out.println("O percentual de audiencia do canal 12 foi: " + perct_aud_canal12);

        teclado.close();
    }
}

/*
 * import java.util.Scanner; public class Exercicio18 { public static void
 * main(String[] args) { Scanner teclado = new Scanner(System.in);
 * 
 * int ligar_TV_desligar_TV = 0; int quantidadeCanal_4 = 0; int
 * quantidadeCanal_5 = 0; int quantidadeCanal_9 = 0; int quantidadeCanal_12 = 0;
 * int opcao_canal = 0; int total_canais = 4; int TV_desligada = 0; int
 * perct_aud_canal4 = 0; int perct_aud_canal5 = 0; int perct_aud_canal9 = 0; int
 * perct_aud_canal12 = 0;
 * 
 * System.out.print("ligar TV = 1, Desligar TV = 0: "); ligar_TV_desligar_TV =
 * teclado.nextInt();
 * 
 * while (ligar_TV_desligar_TV != 0) { System.out.print("Informe o canal:");
 * opcao_canal = teclado.nextInt();
 * 
 * switch(opcao_canal) { case 4: quantidadeCanal_4 += 1; break; case 5:
 * quantidadeCanal_5 += 1; break; case 9: quantidadeCanal_9 += 1; break; case
 * 12: quantidadeCanal_12 += 1; break; case 0: TV_desligada += 1; break; } }
 * perct_aud_canal4 = (quantidadeCanal_4 * 100) /4; perct_aud_canal5 =
 * (quantidadeCanal_5 * 100) /4; perct_aud_canal9 = (quantidadeCanal_9 * 100)
 * /4; perct_aud_canal12 = (quantidadeCanal_12 * 100) /4;
 * 
 * System.out.println("O percentual de audiencia do canal 4 foi: "
 * +perct_aud_canal4);
 * System.out.println("O percentual de audiencia do canal 5 foi: "
 * +perct_aud_canal5);
 * System.out.println("O percentual de audiencia do canal 9 foi: "
 * +perct_aud_canal9);
 * System.out.println("O percentual de audiencia do canal 12 foi: "
 * +perct_aud_canal12);
 * 
 * System.out.println("ligar TV = 1, Desligar TV = 0: "); ligar_TV_desligar_TV =
 * teclado.nextInt(); teclado.close(); } }
 */