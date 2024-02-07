import java.util.Scanner;

public class Withdraw {
    public static void main(String[] args) {

        int valor;
        String nome;

        int SAQUE_MAXIMO = 1000;
        int SAQUE_MINIMO = 10;

        var saldo = Math.random() * 10000;
        System.out.println("Saldo inicial: " + saldo);

        System.out.println("Informe os dados para saque");
        var input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = input.nextLine();

        System.out.println("Quanto quer sacar: ");
        valor = input.nextInt();

        if (valor <= saldo) {

            if (valor > SAQUE_MAXIMO || valor < SAQUE_MINIMO || valor % 10 != 0) {
                System.out.println("Valor inválido para saque");
                String salddFormatado = String.format("%.2f", saldo);
                System.out.println("Saldo atual: " + salddFormatado);
                return;
            }

            saldo -=  valor;

            System.out.println("Olá " + nome + ", o saque de R$ " + valor + " foi autorizado.");
            String salddFormatado = String.format("%.2f", saldo);
            System.out.println("Saldo atual: " + salddFormatado);


        }
        else {
            System.out.println("Saldo insuficiente");
            String salddFormatado = String.format("%.2f", saldo);
            System.out.println("Saldo atual: " + salddFormatado);
        }


//
    }
}



