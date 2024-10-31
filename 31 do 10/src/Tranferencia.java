public class Tranferencia extends Transacao {
    private String contaOrigem, contaDestino;

    public Tranferencia(double valor, String data, String descicao, String contaOrigem, String contaDestino) {
        super(valor, data, descicao);
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public String getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(String contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public String getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(String contaDestino) {
        this.contaDestino = contaDestino;
    }

    @Override
    public void emitirComprovante(){
        super.emitirComprovante();
        System.out.println("Conta origem: "+getContaOrigem());
        System.out.println("Conta Destino: "+getContaDestino());
    }
    
}
