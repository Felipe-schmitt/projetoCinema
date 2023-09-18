package entities;

import java.util.ArrayList;
import java.util.Scanner;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Cliente extends Pessoa{
    @Id 
    private static Integer id;
    private static ArrayList<Cliente> listaCliente = new ArrayList<>();


    public Cliente(String nome, String cpf, String email, String tel) {
        super(nome, cpf, email, tel);
    }

    public static void cadastraCliente(){
        Scanner leiaDados = new Scanner(System.in);

        while(true){
            System.out.println("CADASTRO DE CLIENTE:");
            System.out.println("");
            System.out.println("Digite seu nome:");
            String nome = leiaDados.nextLine();
            System.out.println("Digite seu cpf: ");
            String cpf = leiaDados.nextLine();
            System.out.println("Digite seu email: ");
            String email = leiaDados.nextLine();
            System.out.println("Digite seu telefone: ");
            String tel = leiaDados.nextLine();
    
            Cliente clienteNovo = new Cliente(nome, cpf, email, tel);
            listaCliente.add(clienteNovo);
            System.out.println("Cliente cadastrado!!");

            cadastrarNovamente();
            break;
        }


        //Cliente cliente = new Cliente(getNome(), getCpf(), getEmail(), getTel(), getEndereco());
        //Cliente.listaCliente.add(cliente);
    }

    public static void listarCliente(){
        if (listaCliente.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
        } else {
            System.out.println("Lista de Clientes:");
            for (Cliente cliente : listaCliente) {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("Email: " + cliente.getEmail());
                System.out.println("Telefone: " + cliente.getTel());
                System.out.println("-----------------------------");
            }
        }
    }

    public void editaCliente(){

    }

    public void excluirCliente(){

    }

    public static void cadastrarNovamente(){
        int resposta;
        Scanner leia = new Scanner(System.in);
        System.out.println("Deseja cadastrar outro cliente? (Digite [1] para sim, [2] para não!!)");
        resposta = leia.nextInt();

        switch (resposta) {
            case 1:
                cadastraCliente();
                break;
            case 2:
                break;
            default:
                System.out.println("Dê uma resposta válida!!");
                cadastrarNovamente();
                break;
        }
    }

}
