import java.util.Scanner;
public class Exercicio10
{
    public static void main(String[]args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a ideade Marquinhos:");
        int Marquinhos = entrada.nextInt();

        System.out.print("Digite a ideade Zezinho:");
        int Zezinho = entrada.nextInt();

        System.out.print("Digite a ideade Luluzinha:");
        int Luluzinha = entrada.nextInt();

        if(Marquinhos < Zezinho && Marquinhos < Luluzinha )
        {
            System.out.println("Marquinhos é o caçula");
        }
        else{
        if(Zezinho < Marquinhos && Zezinho < Luluzinha)
        {
            System.out.println("Zezinho é o caçula");
        }
        else {
        if(Luluzinha < Marquinhos && Luluzinha < Zezinho)
        {
            System.out.println("Luluzinha é a caçula");
        }
        

        entrada.close();
    }
}
    }
}
