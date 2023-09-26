package projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Metodos {

    List<Formulario> lista = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    
    
    private void adicionar(Formulario formulario) {

        lista.add(formulario);

    }

    
    private void listar() {

        Collections.sort(lista);

        for (Formulario f : lista) {

            System.out.println(f);

        }

    }

    
    public void menu() {

        while (true) {

            imprimeItensMenu();
            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {

                case 1 -> {
                   
                    adicionar(leitura());
                    listar();
                }
                case 0 -> System.exit(0);
                default -> System.out.println("\nOpção inválida.");

            }

        }

    }

    
    private void imprimeItensMenu() {

        System.out.println("\nDigite 1 para Cadastrar: ");
        System.out.println("Digite 0 para Sair.");
        System.out.print("Opcao: ");

    }
    
    

    private Formulario leitura() {

        System.out.print("\nDigite o Nome do Produto: ");
        String nome = scan.nextLine();
        System.out.print("Digite a Descricao do Produto: ");
        String descricao = scan.nextLine();
        System.out.print("Digite o valor do Produto: ");
        Double valor = scan.nextDouble();
        System.out.print("Digite sim para produto disponivel e nao para produto indisponivel: ");
        String disVenda = scan.next();
        boolean verifica;
        //System.out.println();

        if (disVenda.equalsIgnoreCase("nao") || disVenda.equalsIgnoreCase("não")) {
            verifica = false;
        } else {
            verifica = true;
        }

        return new Formulario(nome, descricao, valor, verifica);

    }

}
