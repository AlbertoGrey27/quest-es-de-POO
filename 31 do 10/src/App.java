import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       

        Transacao t1 = new Transacao(100, "31/10/2024", "mensalidade");
       //t1.emitirComprovante();

        Tranferencia tranferencia = new Tranferencia(20, "31/10/2024", "Aluguel da capa", "MP", "Loja");

        //tranferencia.emitirComprovante();

        Transacao pagamentob1 = new PagamentoBoleto(100, "31/10/2024", "mensalidade", "aaaaaa", "05/11/2024");

        pagamentob1.emitirComprovante();

        ArrayList<Transacao> transacoes = new ArrayList<>();

        transacoes.add(pagamentob1);
        transacoes.add(t1);
        transacoes.add(tranferencia);

        for (Transacao transacao : transacoes) {
            if (transacao instanceof PagamentoBoleto) {
                transacao.emitirComprovante();
                
            }
        }
       
    }
}
