import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Passo 1: Importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Passo 2: Exibir mensagens para o usuário
        System.out.println("Bem-vindo! Por favor, insira os dados para criar a sua conta.");

        // Passo 3: Obter valores digitados no terminal
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu número de conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo inicial da sua conta: ");
        double saldoInicial = scanner.nextDouble();

        // Passo 4: Exibir mensagem de conta criada
        System.out.println("Conta criada com sucesso para " + nome + " com número " + numeroConta + " e saldo inicial de R$" + saldoInicial);

        // Fechar o scanner
        scanner.close();
    }
}
