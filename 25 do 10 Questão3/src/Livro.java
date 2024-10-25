public class Livro extends ItemBiblioteca {
    /*Crie uma subclasse Livro de ItemBiblioteca com atributos adicionais autor e genero. Sobrescreva o método exibirDetalhes para incluir esses atributos */
    private String autor, genero;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Livro(String titulo, String tipoItem, int anoPublicacao, String autor, String genero) {
        super(titulo, tipoItem, anoPublicacao);
        this.autor = autor;
        this.genero = genero;
    }
    
    @Override
    public String exibirDetalhes(){
        return super.exibirDetalhes()+getTitulo()+" "+getTipoItem()+" "+getAnoPublicacao();
    }
}
