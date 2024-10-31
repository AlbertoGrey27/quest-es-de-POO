public class PagamentoBoleto extends Transacao {
    private String linhaDigitavel,dataVencimento;

    public PagamentoBoleto(double valor, String data, String descicao, String linhaDigitavel, String dataVencimento) {
        super(valor, data, descicao);
        this.linhaDigitavel = linhaDigitavel;
        this.dataVencimento = dataVencimento;
    }

    public String getLinhaDigitavel() {
        return linhaDigitavel;
    }

    public void setLinhaDigitavel(String linhaDigitavel) {
        this.linhaDigitavel = linhaDigitavel;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void emitirComprovante(){
        super.emitirComprovante();
        System.out.println("Linha digitavel: "+getLinhaDigitavel());
        System.out.println("Data de vencimento: "+getDataVencimento());
    
    }
    
}
