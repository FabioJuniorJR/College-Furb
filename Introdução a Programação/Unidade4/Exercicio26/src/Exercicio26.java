import java.util.Scanner;
public class Exercicio26
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escolha uma opcao:\n'T':Calcular a area de um triangulo de base b e altura h\n'Q':Calcular a area de um quadradode lado l\n'R':Calcular a altura de triangulo de base b e altura h\n'C':Calcular a area de um circulo de raio r\n");
        char opcao = teclado.next().charAt(0);
        

        switch (opcao) {
            case 'T':
            System.out.print("Digite o valor da base:");
            double base = teclado.nextDouble();
            System.out.print("Digite o valor da altura:");
            double altura = teclado.nextDouble();
            double area_triangulo = (base * altura)/2;
            System.out.println("A área vale:"+area_triangulo);
            break;
            case 'Q':
            System.out.print("Digite o valor do lado:");
            double lado = teclado.nextDouble();
            double area_quadrado = lado * lado;
            System.out.println("A área vale:"+area_quadrado);
            break;
            case 'R':
            System.out.print("Digite o valor da base:");
            double b = teclado.nextDouble();
            System.out.print("Digite o valor da altura:");
            double h = teclado.nextDouble();
            double area_retangulo = (b * h);
            System.out.println("A área vale:"+area_retangulo);
            break;
            case 'C':
            System.out.print("Digite o valor do raio:");
            double raio = teclado.nextDouble();
            double area_circulo = Math.PI * Math.pow(raio, 2);
            System.out.println("A área vale:"+area_circulo);
            break;
        }

        
        teclado.close();
    }
}