import java.util.Scanner;

public class Withdraw {
    public static <notas> void main(String[] args) {

        int valor;
        String nome;

        int VALOR_DE_SAQUE_MAXIMO = 1000;
        int VALOR_DE_SAQUE_MINIMO = 10;

        int[] notas = {10, 20, 50, 100};

        var saldo = Math.random() * 1000;

        System.out.println("Informe os dados para saque");
        var input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = input.nextLine();

        System.out.println("Quanto quer sacar: ");
        valor = input.nextDouble();
        String valorFormatado = String.format("%.2f", valor);
        String salddFormatado = String.format("%.2f", saldo);

        // preciso verificar se o valor que eu quero sacar é possível de acordo com as notas em dinheiro presentes no caixa eletronico
        // se a divisão der resto difereten de zero, eu devo pegar apenas o quociente e multiplicar pelo valor da nota
        // do resto, eu diminuo do produto e faço a divisão novamente pela nota mais baixa que a usada anteriormente
        public static void verifica_condiçao_saque (notas) {
           for( int nota : notas ) {
                if (valor % nota == 0) {

                }
           }
        }
        if (valor <= saldo) {
            // saldo -= valor;
            System.out.println("Olá " + nome + ", o saque de R$" + valorFormatado + " foi realizado com sucesso!");
            System.out.println("Saldo atual: " + salddFormatado);
        }
        else {
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo atual: " + salddFormatado);
        }
        else{
            System.out.println("Olá " + nome + ", o saque de R$" + valorFormatado + " não pode ser realizado devido ao valor indicado ser ou menor que R$10,00 ou maior que R$1000,00.");

        }
    }
}



