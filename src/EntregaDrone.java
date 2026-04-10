public class EntregaDrone  extends Entrega{

    public EntregaDrone(Pedido pedido){
        super(pedido);
    }
    @Override
    public void realizarEntrega(){
            System.out.println("Entrega sendo realizad por drone!");
    }
}
