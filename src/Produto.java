public class Produto {

    private int idProduto;
    public String nome;
    public String descricao;
    protected double preco;
    public Categoria categoria;
    private int estoque;


    public Produto(int idProduto,String nome,
                   String descricao, double preco, Categoria categoria,int estoque){
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.estoque = estoque;

    }
    public double getPreco(){
        return preco;

    }
    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public void  setpreco(double preco){
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setcategoria(Categoria categoria){
       this.categoria = categoria;
    }

    public void reduzirEstoque(int quantidade){
        if (quantidade <= estoque){
            estoque -= quantidade;
        }
        else {
            System.out.println("estoque indisponivel");
        }
    }

    public void adicionarEstoque(int quantidade){
        if (quantidade > 0){
            estoque += quantidade;
        }
        else {
            System.out.println("Quantidade inválida!");
        }
    }

}
