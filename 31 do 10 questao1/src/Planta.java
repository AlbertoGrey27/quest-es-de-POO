public class Planta {
    /*Crie uma classe base chamada Planta com atributos nome (String) e altura (double). Adicione um método crescer() que aumenta a altura da planta em uma quantidade fixa.
Crie duas subclasses de Planta: Arvore e Flor. Sobrescreva o método crescer() em cada subclasse:
Em Arvore, o método deve aumentar a altura em uma taxa maior.
Em Flor, o método deve aumentar a altura em uma taxa menor e exibir uma mensagem adicional indicando o crescimento.
Na classe principal, Jardim, implemente um array de objetos Planta chamado plantas para armazenar múltiplas instâncias de Arvore e Flor. Adicione métodos para:
Adicionar uma nova planta ao array.
Fazer todas as plantas do array "crescerem" ao chamar o método crescer() em um loop.

Obs: Implemente as classes e o array de objetos na classe Jardim. Demonstre o uso de polimorfismo no array ao chamar crescer() para cada planta armazenada. Adicione pelo menos três plantas de cada tipo e mostre a altura atualizada após o crescimento.
 */
    private String nome;
    private double altura;
    public Planta(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crescer(){
        setAltura(getAltura()+5);
    }
    
}
