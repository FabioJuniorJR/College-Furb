import java.util.Scanner;

public class Exercicio17
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        double alt_atleta1 = 0;
        double alt_atleta2 = 0;
        double alt_baixo = 0;
        double alt_alto = 0;
        double media_alts = 0;

        System.out.print("Digite o numero de inscricao do atleta 1:");
        int number_subscripition_atleta1 = teclado.nextInt();    

        while (number_subscripition_atleta1 != 0)
        {
        System.out.print("Digite a altura do atleta 1:");
        alt_atleta1 = teclado.nextDouble();
        System.out.print("Digite o numero de inscricao  do atleta 2:");
        int number_subscripition_atleta2 = teclado.nextInt();
        System.out.print("Digite a altura do atleta 2:");
        alt_atleta2 = teclado.nextDouble();

        if(alt_atleta1 < alt_atleta2)// mais baixo
        {
            alt_baixo = alt_atleta1;
        }
        else{
            if(alt_atleta2 < alt_atleta1)
            {
                alt_baixo = alt_atleta2;
            }
        }
        if(alt_atleta1 > alt_atleta2)// mais alto
        {
            alt_alto = alt_atleta1;
        }
        else{
            if(alt_atleta2 >  alt_atleta1)
            {
                alt_alto = alt_atleta2;
            }
        }
        media_alts =  (alt_atleta1 + alt_atleta2) /2;

        System.out.println("Numero de inscricao do atleta mais alto: "+number_subscripition_atleta1+" Altura: "+alt_alto);
        System.out.println("Numero de inscricao do atleta mais baixo: "+number_subscripition_atleta2+" Altura: "+alt_baixo);
        System.out.println("A media da alturas dos atletas: "+media_alts);

        System.out.print("\n"+"Digite o numero de inscricao do atleta 1:");
        number_subscripition_atleta1 = teclado.nextInt();   
        }
        teclado.close();
    }
}













/*
double altura = 0;
        double soma_alt_atletas = 0;
        double media_alt_atletas = 0;

        System.out.print("Digite o numero da inscricao:");
        int number_subscription = teclado.nextInt();

        while (number_subscription != 0)
        {
            System.out.print("Digite a altura:");
            altura = teclado.nextInt();




            media_alt_atletas = soma_alt_grupo / num_;

            System.out.print("Digite o numero da inscricao:");
            number_subscription = teclado.nextInt();
        }
*/