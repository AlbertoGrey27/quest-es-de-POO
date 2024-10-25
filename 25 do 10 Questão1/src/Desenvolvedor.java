public class Desenvolvedor extends Funcionario {
    /*Classe Desenvolvedor: Crie outra subclasse chamada Desenvolvedor,
    também herdando de Funcionario. Adicione um atributo extra, 
    linguagemPreferida, para indicar a linguagem de programação 
    favorita do desenvolvedor. Sobrecarregue o método imprimirDetalhes
    para exibir informações específicas dos desenvolvedores, incluindo a 
    linguagem de programação preferida. */
    private String linguagemPreferida;

    public String getLinguagemPreferida() {
        return linguagemPreferida;
    }

    public void setLinguagemPreferida(String linguagemPreferida) {
        this.linguagemPreferida = linguagemPreferida;
    }

    public Desenvolvedor(String nome, int idade, double salario, String linguagemPreferida) {
        super(nome, idade, salario);
        this.linguagemPreferida = linguagemPreferida;
    }

    @Override
    public String toString() {
        return super.toString()+", linguagemPreferida=" + linguagemPreferida + "]";
    }
    
    

}
