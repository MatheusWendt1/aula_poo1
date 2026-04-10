public class PagamentoCartao implements Pagamento{
    public boolean pago(double valor){
        System.out.println("pagamento via cartao aprovado ");
        return true;
    }
    public String getPagamento(){
        return "cartao";
    }
}

