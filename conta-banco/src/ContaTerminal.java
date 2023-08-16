import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner programa = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        float saldo;

        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Agência ! ");
        agencia = programa.next();
        
        System.out.println("Por favor, digite o número da Conta ! ");
        numero = programa.nextInt();
        
        programa.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Por favor, digite o nome do cliente ! ");
        nomeCliente = programa.nextLine();

        System.out.println("Por favor, digite o saldo ! ");
        saldo = programa.nextFloat();
        //Obter pela Scanner os valores digitados no terminal

        //exibir a mensagem conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", nomeCliente, agencia, numero, saldo);

        programa.close();
    }
}
