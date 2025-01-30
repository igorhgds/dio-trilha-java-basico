import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        double saldo = 237.48;


        //Exibir as mensagens para o nosso usuário


        //Obter os valores digitados
        System.out.println("Por favor, digite o número da Agência!");
        int numeroAgencia = sc.nextInt();

        System.out.println("Agora, digite sua conta e digito:");
        String agencia = sc.next();
        sc.nextLine();
        System.out.println("Informe seu nome:");
        String nome = sc.nextLine();


        //Exibir a mensagem final
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque.");




    }

}