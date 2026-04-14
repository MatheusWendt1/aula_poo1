import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idPedido;

    private Cliente cliente;
    private Entregador entregador;

    private List<ItensPedido> itens = new ArrayList<>();

    public  Pedido(int idPedido, Cliente cliente){
        this.idPedido = idPedido;
        this.cliente = cliente;
    }
    public int getId(){
        return idPedido;
    }
    public void adicionarPedidos(ItensPedido item){
        itens.add(item);
    }

    public double calcularTotal(){
        double total = 0;
        for (ItensPedido item : itens){
            total += item.SubTotal();
        }
        return total;
    }
    public void finalizarPedido(){
        double total = calcularTotal();
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }
}

