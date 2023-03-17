import java.util.Scanner;
public class Exercicio12
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado 1:");
        int lado1 =  teclado.nextInt();

        System.out.print("Digite o comprimento do lado 2:");
        int lado2 =  teclado.nextInt();

        System.out.print("Digite o comprimento do lado 3:");
        int lado3 =  teclado.nextInt();
        if(lado1 == 0 || lado2 == 0 || lado3 == 0 )
        {
            System.out.println("Não pode ser um triangulo");
        }
        else{
        if(lado1 > 0 && lado2 >0 && lado3 >0)
        {                      
            System.out.println("Sim, pode ser um triangulo ");                   
        }
        if(lado1 == lado2 && lado1 != lado3 && lado2 != lado3 && lado1 > 0 && lado2 > 0 && lado3 > 0)
        {
            System.out.println("Triangulo Isoceles");   
        }
        else{
        if(lado1 == lado3 && lado1 != lado2 && lado3 != lado2 && lado1 > 0 && lado2 > 0 && lado3 > 0) 
        {
            System.out.println("Triangulo Isoceles");
        }
        if(lado2 == lado3 && lado2 != lado1 && lado3 != lado1 && lado1 > 0 && lado2 > 0 && lado3 > 0) 
        {
            System.out.println("Triangulo Isoceles");
        }
        else{
        if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3 && lado1 > 0 && lado2 > 0 && lado3 > 0)
        {
            System.out.println("Triangulo Equilatero");
        }
        else{
        if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3 && lado1 > 0 && lado2 > 0 && lado3 > 0)
        {
            System.out.println("Triangulo Escaleno");
        }
        teclado.close();
                  }
               }
            }  
        }
    }
}
     
