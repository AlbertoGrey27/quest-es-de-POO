public abstract class Funcionario {
    /*Classe Funcionario: Comece criando uma classe base chamada Funcionario com os seguintes atributos: nome, idade e salario. Crie um construtor e métodos 
    getters e setters para esses atributos. Além disso, implemente um método chamado calcularBonusAnual que calcula o bônus anual, que é 10% do salário anual
    do funcionário. Por fim, adicione um método imprimirDetalhes que exibe o nome, idade e salário do funcionário. */
    private String nome;
    private int idade;
    private double salario, bonusAnual;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getBonusAnual() {
        return bonusAnual;
    }
    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
    
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.bonusAnual = 0;
    }
    
    public void calcularBonusAnual(){
        bonusAnual = (salario*12)/10;
        setSalario(salario+bonusAnual);
    }
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", idade=" + idade + ", salario=" + salario;
    }
    

    
    
}
