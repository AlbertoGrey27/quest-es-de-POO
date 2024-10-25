public class Professor extends Pessoa {

    private boolean temMestrado;

    public boolean isTemMestrado() {
        return temMestrado;
    }

    public void setTemMestrado(boolean temMestrado) {
        this.temMestrado = temMestrado;
    }

    @Override
    public String toString() {
        return super.toString()+ "temMestrado=" + temMestrado + "]";
    }

    public Professor(String nome, double peso, double altura, int idade, boolean temMestrado) {
        super(nome, peso, altura, idade);
        this.temMestrado = temMestrado;
    }
    
    
    
    
}
