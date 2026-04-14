import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private int id_Restaurante;
    public String nomeRestaurante;
    protected String enderecoRestaurante;
    private List<Produto> Cardapio = new ArrayList<>();

    public Restaurante(int id_Restaurante ,String nomeRestaurante, String enderecoRestaurante){
        this.id_Restaurante = id_Restaurante;
        this.nomeRestaurante = nomeRestaurante;
        this.enderecoRestaurante = enderecoRestaurante;
    }
    public void adicionarProduto(Produto produto){
        Cardapio.add(produto);
    }
    public List<Produto> getCardapio(){
        return Cardapio;
    }

    public void setCardapio(List<Produto> cardapio) {
        Cardapio = cardapio;
    }

    public int getId_Restaurante(){
        return id_Restaurante;
    }
    public void setId_Restaurante(int id_Restaurante){
        this.id_Restaurante = id_Restaurante;
    }

    public String getnomeRestaurante(){
        return nomeRestaurante;
    }
    public void setnomeRestaurante(String nomeRestaurante){
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getenderecoRestaurante(){
        return enderecoRestaurante;
    }
    public void setEnderecoRestaurante(String enderecoRestaurante){
        this.enderecoRestaurante = enderecoRestaurante;
    }
}
