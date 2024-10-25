public abstract class Produto {
    private String nome;
    private double preco;
    private int codigoBarras;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getCodigoBarras() {
        return codigoBarras;
    }
    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    public Produto(String nome, double preco, int codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", codigoBarras=" + codigoBarras;
    }
    
    

}
