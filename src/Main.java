import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Scanner sc= new Scanner(System.in);
    private static List<Cliente> clientes = new ArrayList<>();
    private static  int idcliente = 1;
    public static void main(String[] args) {
        System.out.println("======Cadastro de Cliente======");
        System.out.println("Digite o nome do cliente");
        String nome = sc.nextLine();

        System.out.println("digite seu CPF");
        String CPF = sc.nextLine();

        System.out.println("Digite o email");
        String email = sc.nextLine();

        System.out.println("Digite a senha");
        String senha = sc.nextLine();

        System.out.println("Digite seu telefone");
        String telefone = sc.nextLine();

        String tipoUsiario = "cliente";

        System.out.println("Digite o endereço");
        String endereco = sc.nextLine();


        Cliente cliente = new Cliente(idcliente,nome,CPF, email, senha, telefone, tipoUsiario, endereco);
        clientes.add(cliente);

        idcliente++;

        System.out.println("Cliente cadastrado com sucesso");

        System.out.println("CLiente:"+ cliente);

    }
}