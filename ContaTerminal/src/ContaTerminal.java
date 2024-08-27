import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal { 
    public static void main(String[] args) { 
        double saldo = 0; 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        
        System.out.println("Digite o numero da conta: "); 
        int numero = scanner.nextInt(); 
        
        System.out.println("Por favor, digite o número da Agência! "); 
        String agencia = scanner.next(); 

        System.out.println("Digite seu nome: "); 
        String nomeCliente = scanner.next(); 
        
        scanner.close(); 
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponivel para saque!"); 
    } 
}