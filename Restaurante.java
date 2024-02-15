import java.util.ArrayList;

public class Restaurante {
    public String nome;
    public double avaliacao;
    public ArrayList<Item> cardapio;

    public Restaurante(String nome,double avaliacao,ArrayList<Item> cardapio){
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.cardapio = cardapio;
    }

    public void get_nome(){
        System.out.println("nome" + this.nome);
    }

    public void adicionar_item(Item item){
        this.cardapio.add(item);
    }

    public void imprimir_menu(){
        for(Item item : this.cardapio){
            System.out.println(item.nome + " : " + item.preco);
        }
    }
}