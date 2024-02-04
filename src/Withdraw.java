import java.util.Scanner;

public class Withdraw {
    public static void main(String[] args) {

        String nome;
        int VALOR_DE_SAQUE_MAXIMO = 1000;
        int VALOR_DE_SAQUE_MINIMO = 10;
        double valor;

        var saldo = Math.random() * 1000;

        System.out.println("Informe os dados para saque");
        var input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = input.nextLine();

        System.out.println("Quanto quer sacar: ");
        valor = input.nextDouble();
        String valorFormatado = String.format("%.2f", valor);
        String salddFormatado = String.format("%.2f", saldo);

       if( valor >= VALOR_DE_SAQUE_MINIMO  && valor <= VALOR_DE_SAQUE_MAXIMO ) {
           if (valor <= saldo) {
//               saldo -= valor;
               System.out.println("Olá " + nome + ", o saque de R$" + valorFormatado + " foi realizado com sucesso!");
               System.out.println("Saldo atual: " + salddFormatado);
           } else {
               System.out.println("Saldo insuficiente");
               System.out.println("Saldo atual: " + salddFormatado);
           }
       } else {
           System.out.println("Olá " + nome + ", o saque de R$" + valorFormatado + " não pode ser realizado devido ao valor indicado ser ou menor que R$10,00 ou maior que R$1000,00.");

       }
    }
}


