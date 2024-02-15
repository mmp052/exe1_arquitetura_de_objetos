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

            }
            

            if(opcao.equals("2")){
                System.out.println("Restaurantes Cadastrados:");
                for (int i = 0; i < Restaurantes.size(); i++){
                    System.out.println(i + ":" + Restaurantes.get(i).nome);
                    Restaurantes.get(i).imprimir_menu();
                }
            }

        }
    }
}
