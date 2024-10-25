public class Revistas extends ItemBiblioteca {
    /*Crie uma subclasse Revista de ItemBiblioteca com atributos adicionais edicao e periodicidade. Sobrescreva o método exibirDetalhes para incluir esses atributos. */
    private int edicao, periodicidade;

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(int periodicidade) {
        this.periodicidade = periodicidade;
    }

    public Revistas(String titulo, String tipoItem, int anoPublicacao, int edicao, int periodicidade) {
        super(titulo, tipoItem, anoPublicacao);
        this.edicao = edicao;
        this.periodicidade = periodicidade;
    }
    
    @Override
    public String exibirDetalhes(){
        return super.exibirDetalhes()+getEdicao()+" "+getPeriodicidade();
    }
    
}
