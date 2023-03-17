public class ExemplosMetodosParametros {
    public ExemplosMetodosParametros() {
        //Chamada método 1:
        somarSemRetornoSemParametro();

        //Chamada método 2:
        int retornoDoMetodo = somarComRetornoSemParametro();
        System.out.println("A soma é " + retornoDoMetodo);

        //Chamada método 3:
        somarSemRetornoComParametro(5, 2);

        int numero1 = 10;
        int numero2 = 50;
        somarSemRetornoComParametro(numero1, numero2);
        System.out.println("Novo numero 1: " + numero1);

        //Chamada método 4:
        int retorno = somarComRetornoComoParametro(numero1, numero2);
        System.out.println("Saída do método: " + retorno);

        //Chamada método 5:
        int numeros[] = new int[5];
        System.out.println("Valor do vetor posição 0 antes do método: " + numeros[0]);
        exemploParametroReferencia(numeros);
        System.out.println("Valor do vetor posição 0: " + numeros[0]);
    }
    public void somarSemRetornoSemParametro() {
        int num1 = 4;
        int num2 = 5;

        int soma = num1 + num2;

        System.out.println("Soma = " + soma);
    }
    private int somarComRetornoSemParametro() {
        int num1 = 4;
        int num2 = 5;

        int soma = num1 + num2;

        return soma;
    }
    private void somarSemRetornoComParametro(int n1, int n2) {
        int soma = n1 + n2;

        n1++;

        System.out.println("Soma = " + soma + " numero " + n1);
    }
    private int somarComRetornoComoParametro(int n1, int n2) {
        int soma = n1 + n2;
        return soma;
    }
    private void exemploParametroReferencia(int[] vetor) {

        vetor[0] = 10;

        System.out.println("Valor posição 0: " + vetor[0]);
    }
    public static void main(String[] args) {
        new ExemplosMetodosParametros(); 
    }
}