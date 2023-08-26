import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		
		int numeroConta;
		String agencia;
		String nomeCliente;
		float saldo;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número da conta:\n ");
		numeroConta = sc.nextInt();
		System.out.println("Digite a agência da conta:\n ");
		agencia = sc.next();
		System.out.println("Digite o saldo do Cliente:\n ");
		saldo = sc.nextFloat();
		System.out.println("Digite o nome do Cliente:\n ");
		nomeCliente = sc.next();
		sc.close();
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque.");
		
	}

}
