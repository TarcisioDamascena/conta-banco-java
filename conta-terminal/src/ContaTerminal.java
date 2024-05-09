import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem-vindo ao sistema de bancos JAVA!");

        System.out.println("Para continuar criando sua conta, por favor digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Para continuar, por favor digite o numero de sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Para continuar, por favor digite o numero da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Para continuar, por favor digite o valor do primeiro depósito: ");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "
                        + conta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}