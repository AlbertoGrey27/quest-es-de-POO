public class Gerente extends Funcionario {
    /*Classe Gerente: Crie uma subclasse chamada Gerente,
     que herda de Funcionario. Adicione um atributo adicional, 
     projetosGerenciados, que representa o número de projetos que 
     o gerente está supervisionando. Sobrescreva o método 
     calcularBonusAnual para calcular o bônus anual de forma 
     diferente, sendo 15% do salário anual mais um bônus fixo
    de R$1000 por projeto gerenciado. */
    private int projetosGerenciados;

    public int getProjetosGerenciados() {
        return projetosGerenciados;
    }
    public void setProjetosGerenciados(int projetosGerenciados) {
        this.projetosGerenciados = projetosGerenciados;
    }
   

    public Gerente(String nome, int idade, double salario, int projetosGerenciados) {
        super(nome, idade, salario);
        this.projetosGerenciados = projetosGerenciados;
    }



    @Override
    public void calcularBonusAnual(){
        setBonusAnual((getSalario()*0.15*12)+getProjetosGerenciados()*1000);
        setSalario(getSalario()+getBonusAnual());
    }
    @Override
    public String toString() {
        return super.toString()+", projetosGerenciados=" + projetosGerenciados + "]";
    }

    


    
    
}
