import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numero;
        String agencia;
        String nomecliente;
        double saldo = 100;

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta:");
        numero = input.nextInt();

        System.out.println("Por favor, digite o número da sua agência:");
        agencia = input.next();

        System.out.println("Por favor, digite seu nome:");
        nomecliente = input.next();

        System.out.println("Olá " + nomecliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");





    }
}
