import java.util.Scanner;
public class Exercicio14
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o dia:");
        int dia =  teclado.nextInt();

        System.out.print("Digite o mes:");
        int mes =  teclado.nextInt();

        System.out.print("Digite o ano:");
        int ano =  teclado.nextInt();

        if(mes == 2 && dia >= 1 && dia <= 28) 
        {
            System.out.println("Data Valida");
        }
        else{
        if(mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia >= 1 && dia <= 30)
        {
            System.out.println("Data Valida");
        }
        else{
        if(mes != 4 && mes != 2 && mes != 6 && mes != 9 && mes != 11 && dia >= 1 && dia <= 31)
        {
            System.out.println("Data Valida");
        }
        else{
            System.out.println("Data Invalida");
        teclado.close();
             }
          }  
       }
     }
}

        /*if(mes == 2 && dia >= 1 && dia <= 28)
        {
            System.out.println("Data Valida");
        }
        else{
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia >= 1 && dia <= 30);
            {
                System.out.println("Data Valida");
            }
                if(mes == 4 && mes != 2 && mes == 6 && mes == 9 && mes == 11 && dia >= 1 && dia >= 31);
                {
                    System.out.println("Data Valida");
                }     
            }
        teclado.close();
        }
    }*/