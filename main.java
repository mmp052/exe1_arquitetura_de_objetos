import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    
        ArrayList<Item> items = new ArrayList<Item>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Menu principal");
            System.out.println("1. Cadastrar Restaurante");
            System.out.println("2. Listar Restaurantes");
            System.out.println("3. Cadastrar item no menu de um restaurante");
            System.out.println("4. Sair");

            System.out.println("Escolha uma opção");
            String opcao = scanner.nextLine();

            
        }
    }
}
