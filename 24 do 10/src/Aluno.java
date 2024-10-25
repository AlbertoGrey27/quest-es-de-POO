public class Aluno extends Pessoa {

    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + "matricula=" + matricula + "]";
    }

    public Aluno(String nome, double peso, double altura, int idade, int matricula) {
        super(nome, peso, altura, idade);
        this.matricula = matricula;
    }

    
    
    
}
