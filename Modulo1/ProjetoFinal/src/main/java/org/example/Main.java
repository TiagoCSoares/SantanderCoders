package org.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {

    /*public static void exibirListaContatos(List<Contato> listaContatos) {
        System.out.println("----- Lista de Contatos -----");
        for (Contato contato : listaContatos) {
            System.out.println(contato);
        }
        System.out.println("-----------------------------");
    }*/


    public static void adicionarContato(List<Contato> listaContatos, long idContato) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do Contato:");
        String nome = scanner.next();
        System.out.println("Informe o sobrenome do Contato:");
        String sobrenome = scanner.next();
        System.out.println("Informe o telefone do contato:");

        List<Telefone> listaTelefones = new ArrayList<>();
        long idTelefone = 1;
        String ddd;
        long numero;
        System.out.println("Digite o ddd:");
        ddd = scanner.next();
        System.out.println("Digite o número:");
        numero = scanner.nextInt();

        Telefone novoTel = new Telefone(idTelefone, ddd, numero);
        listaTelefones.add(novoTel);

        for(char tem = 'S'; tem != 'N'; ) {
            System.out.println("Para adicionar um novo telefone " +
                    "digite S/s. Se o contato não possuir mais" +
                    "telefones a serem adicionados digite N/n");
            tem = scanner.next().charAt(0);
            tem = Character.toUpperCase(tem);
            if(tem == 'S') {
                System.out.println("Digite o ddd:");
                ddd = scanner.next();
                System.out.println("Digite o número:");
                numero = scanner.nextInt();
            } else if(tem != 'N') {
                System.out.println("Opção inválida.");
            }
            novoTel = new Telefone(idTelefone, ddd, numero);
            listaTelefones.add(novoTel);
        }

        Contato novoContato = new Contato(idContato, nome, sobrenome, listaTelefones);
        listaContatos.add(novoContato);
    }


    public static void removerContato(List<Contato> listaContatos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o id do contato que você deseja remover:");
        long idRemove = scanner.nextLong();


        for (Iterator<Contato> iterator = listaContatos.iterator(); iterator.hasNext();) {
            Contato contato = iterator.next();

            // Verifica se o ID do contato é igual ao ID informado
            if (contato.getId() == idRemove) {
                // Remove o contato da lista
                iterator.remove();
                System.out.println("Contato removido com sucesso.");
                return; // Termina a execução após remover o contato
            }
        }

        // Se chegou até aqui, o contato com o ID informado não foi encontrado
        System.out.println("Contato com o ID " + idRemove + " não encontrado na lista.");
    }

    public static void main(String[] args) {

        long idContato = 1;
        List<Contato> listaContatos = new ArrayList<>();

        System.out.println("##################\n" +
                "##### AGENDA #####\n" +
                "##################");
        Scanner scanner = new Scanner(System.in);

        System.out.println(">>>> Menu <<<<\n" +
                "1 - Adicionar Contato\n" +
                "2 - Remover Contato\n" +
                "3 - Editar Contato\n" +
                "4 - Exibir os Contatos\n" +
                "5 - Sair");
        int opcao = scanner.nextInt();

        while (opcao != 5) {
            switch (opcao) {
                case 1:
                    adicionarContato(listaContatos, idContato);
                    idContato++;
                    break;
                case 2:
                    removerContato(listaContatos);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
            System.out.println(">>>> Menu <<<<\n" +
                    "1 - Adicionar Contato\n" +
                    "2 - Remover Contato\n" +
                    "3 - Editar Contato\n" +
                    "4 - Sair");
            opcao = scanner.nextInt();
        }

    }
}