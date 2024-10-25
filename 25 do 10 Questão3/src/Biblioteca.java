import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
        /*Crie uma classe Biblioteca que contenha um array de objetos ItemBiblioteca. Implemente os seguintes métodos:
        adicionarItem(ItemBiblioteca item) para adicionar um item à biblioteca.
        listarItens() para listar todos os itens na biblioteca chamando exibirDetalhes para cada item.
        buscarItensPorTipo(String tipo) para listar os itens de um tipo específico.
        Adicione um método recursivo chamado contarItensPorTipo na classe Biblioteca para contar quantos itens de um tipo específico estão na biblioteca. */
        ArrayList<ItemBiblioteca> itemBibliotecas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        public Biblioteca() {
        }

        public void adicionarItem(ItemBiblioteca item){
            itemBibliotecas.add(item);
        }

        public void listarItens(){
            for (ItemBiblioteca IItemBiblioteca : itemBibliotecas) {
                System.out.println(IItemBiblioteca.exibirDetalhes());
            }
        }

        public String buscarItensPorTipo(String tipo){
            for(int indexDosItens = 0; indexDosItens<itemBibliotecas.size();indexDosItens++){
                if(tipo == itemBibliotecas.get(indexDosItens).getTipoItem()){
                    System.out.println(itemBibliotecas.get(indexDosItens).exibirDetalhes()); 
                }
            }
            return " ";
        }

        public ItemBiblioteca contarItemPorTipo(ItemBiblioteca itemBiblioteca, String tipo){
            int numeroItens=0;
            for(int indexDosItens = 0; indexDosItens<itemBibliotecas.size();indexDosItens++){
                if(tipo == itemBibliotecas.get(indexDosItens).getTipoItem()){
                    numeroItens++;
                    return contarItemPorTipo(itemBiblioteca, tipo);
                }
            }
            return itemBiblioteca;
        }
}
