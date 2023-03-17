import java.util.Scanner;
public class Exercicio24
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor 1:");
        int valor1 =  teclado.nextInt();

        System.out.print("Digite o valor 2:");
        int valor2 =  teclado.nextInt();

        System.out.print("Digite o valor 3:");
        int valor3=  teclado.nextInt();

        System.out.print("Informe a opção desejada: \n3 (maior no meio), 2 (crescente), 1 (decrescente): ");
        int opcao =  teclado.nextInt();

        switch (opcao) {
            case 1: //maior meio
            if(valor1 > valor2 && valor1 > valor3)
            {
                System.out.println(valor2);
                System.out.println(valor1);
                System.out.println(valor3);
            }else{
                if(valor2 > valor1 && valor2 > valor3)
                {
                    System.out.println(valor1);
                    System.out.println(valor2);
                    System.out.println(valor3);
                }
            else{
                if(valor3 > valor1 && valor3 > valor2)
                {
                    System.out.println(valor1);
                    System.out.println(valor3);
                    System.out.println(valor2);
                }
            }
        }
         break;
         case 2: //crescente menor
         if(valor1 < valor2 && valor1 < valor3)
         {
            System.out.println(valor1);
         }
         else{
             if(valor2 < valor1 && valor2 < valor3)
             {
                System.out.println(valor2);
             }
             else{
                if(valor3 < valor1 && valor3 < valor2)
                {
                   System.out.println(valor3);
                }
            }
        }
        //crescente meio
        if(valor1 > valor2 && valor1 < valor3 || valor1 < valor2 && valor1 > valor3)
        {
            System.out.println(valor1);
        }
        else{
            if(valor2 > valor1 && valor2 < valor3 || valor2 < valor1 && valor2> valor3)
            {
                System.out.println(valor2);
            }
            else{
                if(valor3 > valor1 && valor3 < valor2)
                {
                    System.out.println(valor3);
                }
            }
        }
        //crescente maior
        if(valor1 > valor2 && valor1 > valor3)
        {
            System.out.println(valor1);
        }
        else{
            if(valor2 > valor1 && valor2 > valor3)
            {
                System.out.println(valor2);
            }
            else{
                if(valor3 > valor1 && valor3 > valor2)
                {
                    System.out.println(valor3);
                }
            }
        }
        break;
        //decrescente maior//////////////////////////////////////////////////
        case 3:
        if(valor1 > valor2 && valor1 > valor3)
        {
            System.out.println(valor1);
        }
        else{
            if(valor2 > valor1 && valor2 > valor3)
            {
                System.out.println(valor2);
            }
            else{
                if(valor3 > valor1 && valor3 > valor2)
                {
                    System.out.println(valor3);
                }
            }
        }
        //decrescente meio
        if(valor1 > valor2 && valor1 < valor3 || valor1 < valor2 && valor1 > valor3)
        {
            System.out.println(valor1);
        }
        else{
            if(valor2 > valor1 && valor2 < valor3 || valor2 < valor1 && valor2> valor3)
            {
                System.out.println(valor2);
            }
            else{
                if(valor3 > valor1 && valor3 < valor2 || valor3 > valor2 && valor3 < valor1) 
                {
                    System.out.println(valor3);
                }
            }
        }
        //decrescente menor
        if(valor1 < valor2 && valor1 < valor3)
        {
            System.out.println(valor1);
        }
        else{
            if(valor2 < valor1 && valor2 < valor3)
            {
                System.out.println(valor2);
            }
            else{
                if(valor3 < valor1 && valor3 < valor2)
                {
                    System.out.println(valor3);
                }
            }
        }
        break;
        default:
        System.out.println("Opcao Invalida");
        }
        teclado.close();
    }
}