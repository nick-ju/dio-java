import java.util.Scanner;

public class ContaTerminal {
    public static String name;
    public static String ag;
    public static int account;
    public static float balance;

    public static void main(String[] args) {
        ContaTerminal.print();
        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + ag + ", conta " + account + " e seu saldo " + balance + " já está disponível para saque.");

    }
    public static void print() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome");
        name = scan.nextLine();
        System.out.println("Bem-vindo(a), " + name);
        System.out.println("Digite o número da agência:");
        ag = scan.nextLine();
        System.out.println("Digite o número da conta: ");
        account = scan.nextInt();
        System.out.println("Digite seu saldo: ");
        balance = scan.nextFloat();
    }

}
