import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da Agência");
        numero = sc.nextInt();

        System.out.println("Digite o nome da Agência!");
        agencia = sc.next();

        System.out.println("Por favor, diga seu nome!");
        nomeCliente = sc.next();

        System.out.println("Informe seu saldo");
        saldo = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente + " ,obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " ,conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        sc.close();
    }
}
