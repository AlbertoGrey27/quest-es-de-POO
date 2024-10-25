public class Livros extends Produto {
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Livros(String nome, double preco, int codigoBarras, String autor) {
        super(nome, preco, codigoBarras);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString()+", autor=" + autor + "]";
    }

   
    
    
}
