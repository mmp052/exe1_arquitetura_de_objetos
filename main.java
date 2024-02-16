import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    
        ArrayList<Restaurante> Restaurantes = new ArrayList<Restaurante>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Menu principal");
            System.out.println("1. Cadastrar Restaurante");
            System.out.println("2. Listar Restaurantes");
            System.out.println("3. Cadastrar item no menu de um restaurante");
            System.out.println("4. Sair");

            System.out.println("Escolha uma opção:");
            String opcao = scanner.nextLine();

            if(opcao.equals("1")){
                System.out.println("Digite o nome do restaurante:");
                String nomeRestaurante = scanner.nextLine();
                System.out.println("Digite a avaliação do restaurante:");
                String avaliacao = scanner.nextLine();
                Restaurante restaurante = new Restaurante(nomeRestaurante, avaliacao);
                Restaurantes.add(restaurante);
                System.out.println("Restaurante " + nomeRestaurante + " cadastrado com sucesso!");

            }

            else if(opcao.equals("2")){
                System.out.println("Restaurantes Cadastrados:");
                for (int i = 0; i < Restaurantes.size(); i++){
                    System.out.println(i + ":" + Restaurantes.get(i).nome);
                    Restaurantes.get(i).imprimir_menu();
                }
            }
            else if(opcao.equals("3")){
                System.out.println("Escolha o número do restaurante para adicionar um item ao menu:");
                int escolha = scanner.nextInt();
                scanner.nextLine();
                Restaurante restauranteEscolhido = Restaurantes.get(escolha); //Array lista tem que usar .get
                System.out.println("Digite o nome do item:");
                String nomeItem = scanner.nextLine();
                System.out.println("Digite o preço do item:");
                double precoItem = scanner.nextDouble();
                Item item = new Item(nomeItem, precoItem);
                restauranteEscolhido.adicionar_item(item);
                System.out.println("Item " + nomeItem + " adicionado ao menu do restaurante " + restauranteEscolhido);
            }
            else if(opcao.equals("4")){
                System.out.println("Obrigado por utilizar o sistema de cadastro de restaurantes!");
                break;
            }
            else{
                System.out.println("Opção inválida. Por favor, escolha uma opção váida");
            }
        }
    }
}
