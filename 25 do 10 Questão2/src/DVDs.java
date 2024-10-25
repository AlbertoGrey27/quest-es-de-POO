public class DVDs extends Produto {
    private String duracao;

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public DVDs(String nome, double preco, int codigoBarras, String duracao) {
        super(nome, preco, codigoBarras);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString()+", duracao=" + duracao + "]";
    }
    
}
