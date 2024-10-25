public class ItemBiblioteca {
    /*atributos titulo, anoPublicacao e tipoItem, e um método exibirDetalhes que imprime esses atributos */
    private String titulo,tipoItem;
    private int anoPublicacao;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTipoItem() {
        return tipoItem;
    }
    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public ItemBiblioteca(String titulo, String tipoItem, int anoPublicacao) {
        this.titulo = titulo;
        this.tipoItem = tipoItem;
        this.anoPublicacao = anoPublicacao;
    }
    
    public String exibirDetalhes(){
        return getTitulo()+" "+getTipoItem()+" "+getAnoPublicacao()+" ";
    }
}
