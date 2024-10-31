public class Transacao {
    private double valor;
    private String data,descricao;
    
    public Transacao(double valor, String data, String descicao) {
        this.valor = valor;
        this.data = data;
        this.descricao = descicao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescicao() {
        return descricao;
    }

    public void setDescicao(String descicao) {
        this.descricao = descicao;
    }
    
    public void emitirComprovante(){
        System.out.println("Descrição: "+this.getDescicao());
        System.out.println("Data: "+getData());
        System.out.println("Valor: "+getValor());
    
    }
}
