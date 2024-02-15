import java.util.ArrayList;

public class Restaurante {
    public String nome;
    public String avaliacao;
    public ArrayList<Item> cardapio;

    public Restaurante(String nome,String avaliacao){
        this.nome = nome;
        this.avaliacao = avaliacao;
    }

    public void get_nome(){
        System.out.println("nome" + this.nome);
    }

    public void adicionar_item(){
        for(Item item : this.cardapio){
            System.out.println(item.nome + " : " + item.preco);
        }
    }
}