import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Digite o número da Agencia");
        contaTerminal.numero = sc.nextInt();
        System.out.println("Digite a Agencia");
        contaTerminal.agencia = sc.next();
        System.out.println("Digite o Nome do Cliente");
        contaTerminal.nomeDoCliente = sc.next();
        System.out.println("Digite o Saldo");
        contaTerminal.saldo = sc.nextDouble();

        System.out.print("Olá " + contaTerminal.nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + contaTerminal.agencia + ", conta " + contaTerminal.numero + " e seu saldo " + contaTerminal.saldo);

        sc.close();
    }
}