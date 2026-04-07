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

}
