public class CDs extends Produto {
    private int numeroFaixas;

    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }

    public CDs(String nome, double preco, int codigoBarras, int numeroFaixas) {
        super(nome, preco, codigoBarras);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString() {
        return super.toString()+", numeroFaixas=" + numeroFaixas + "]";
    }

    
}
