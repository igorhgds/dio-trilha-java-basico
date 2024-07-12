import java.util.Scanner;


abstract class DesafioEncapsulamentoAbstracao {
    protected String tipo;
    protected String metodoAbertura;


    public DesafioEncapsulamentoAbstracao(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }


    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}


class CofreDigital extends DesafioEncapsulamentoAbstracao {


    private int senha;


    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }


    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}


class CofreFisico extends DesafioEncapsulamentoAbstracao {


    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }
}


public class Desafio {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();


        // Verifica o tipo de cofre e toma ação apropriada
        if (tipoCofre.equalsIgnoreCase("digital")) {
            // Cria um cofre digital solicitando a senha
           
            int senha = scanner.nextInt();
           
            int confirmacaoSenha = scanner.nextInt();


            if (senha == confirmacaoSenha) {
                CofreDigital cofreDigital = new CofreDigital(senha);
                cofreDigital.imprimirInformacoes();
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Tipo: Cofre Digital");
                System.out.println("Metodo de abertura: Senha");
                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            // Cria um cofre físico
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        } else {
            System.out.println("Tipo de cofre inválido!");
        }
    }
}