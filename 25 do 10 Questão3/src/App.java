public class App {
    public static void main(String[] args) throws Exception {
        /*Crie uma classe base chamada ItemBiblioteca com atributos titulo, anoPublicacao e tipoItem, e um método exibirDetalhes que imprime esses atributos.

        Crie uma subclasse Livro de ItemBiblioteca com atributos adicionais autor e genero. Sobrescreva o método exibirDetalhes para incluir esses atributos.

        Crie uma subclasse Revista de ItemBiblioteca com atributos adicionais edicao e periodicidade. Sobrescreva o método exibirDetalhes para incluir esses atributos.

        Crie uma classe Biblioteca que contenha um array de objetos ItemBiblioteca. Implemente os seguintes métodos:
        adicionarItem(ItemBiblioteca item) para adicionar um item à biblioteca.
        listarItens() para listar todos os itens na biblioteca chamando exibirDetalhes para cada item.
        buscarItensPorTipo(String tipo) para listar os itens de um tipo específico.

        Adicione um método recursivo chamado contarItensPorTipo na classe Biblioteca para contar quantos itens de um tipo específico estão na biblioteca.

        Escreva um programa que demonstre o uso dessas classes. Adicione itens à biblioteca, liste todos os itens, liste os itens de um tipo específico e conte quantos itens
        de um tipo específico estão na biblioteca usando o método recursivo.
        */
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarItem(new Livro("O nome do vento", "Livro", 2014, "Patrick Rothfuss","Aventura"));
        biblioteca.adicionarItem(new Livro("Percy Jackson", "Livro", 2005, "Rick Riordan","Sociedade Secreta"));
        biblioteca.adicionarItem(new Revistas("Top 10 maiores Conquistas da humanidade", "revista", 2012, 5, 10));

        System.out.println(biblioteca.buscarItensPorTipo("Livro"));

        biblioteca.contarItemPorTipo(, "Livro");

        
    }
}
