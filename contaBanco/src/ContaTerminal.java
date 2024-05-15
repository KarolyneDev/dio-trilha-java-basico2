import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        //TODO:Conhecer e importar a classe Scanner

        Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

        //Exibir as mensagens para o nosso usuário
        //Obter pela Scanner os valores digitados no terminal
        System.out.println("Bem-vindo(a) ao nosso Banco");
		System.out.println();
		System.out.println("Por favor, digite o número da Conta: (1234)");
		numero = sc.nextInt();

		System.out.println("Agora digite o número da Agência: (123-8)");
		agencia = sc.next();

		System.out.println("Me informe seu nome: ");
		nomeCliente = sc.next();
		sc.nextLine();

		System.out.println("Agora me informa seu saldo atual: ");
		saldo = sc.nextDouble();
        

        //Exibir a mensagem conta criada
        System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", nomeCliente, agencia, numero, saldo);
    }
}
