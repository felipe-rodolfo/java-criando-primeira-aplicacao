import java.util.Scanner;

public class Main {
    static void main() {

        String nome = "Felipe";
        String tipoConta = "corrente";
        double saldo = 2500;
        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println();
        System.out.println("Operações");
        int operacao = 0;
        while(operacao != 4) {
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println();
            System.out.println("Digite a opção desejada");
            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println("O saldo atual é R$ " + saldo);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Até a próxima");
                    operacao = 4;
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Informe o valor a receber");
                    double valorReceber = sc.nextDouble();
                    saldo += valorReceber;
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Informe o valor a transferir");
                    double valorTransferir = sc.nextDouble();
                    if (valorTransferir > saldo) {
                        throw new IllegalArgumentException("Saldo insuficiente");
                    }
                    saldo -= valorTransferir;
                    System.out.println("Saldo atualizado R$ " + saldo);
                    System.out.println();
                    break;
            }
        }
    }
}
