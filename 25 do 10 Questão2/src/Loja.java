import java.util.Scanner;

public class Loja {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       Livros nomeDoVento = new Livros("O nome do Vento", 60, 01, "Patrick Rothfuss");
       CDs americanIdiot = new CDs("American Idiot", 30, 02, 12);
       DVDs AvidaEumaFesta = new DVDs("VIVA a vida é uma festa", 40, 03, "2h");
       Livros Ceifador = new Livros("O ceifador", 50, 04, "Neal Shusterman");
       DVDs missaoImpossivel = new DVDs("Missão impossivel", 30, 05, "1h50");
       
       Produto[] Pon = new Produto[7];
       Pon[0] = nomeDoVento;
       Pon[1] = americanIdiot;
       Pon[2] = AvidaEumaFesta;
       Pon[3] = Ceifador;
       Pon[4] = missaoImpossivel;
       
       System.out.println("Digite o codigo de barras do produto");
       for(int i = 0 ;i < Pon.length-2 ; i++ ){
        System.out.println(Pon[i].toString());
       }
       int resposta = sc.nextInt();
       
       int auxiliar = 0;
       boolean verificar = false;
       for(int i = 0 ;i < Pon.length-2 ; i++ ){
            if(Pon[i].getCodigoBarras()==resposta){
                verificar=true;
                auxiliar = i;
            };
       };
       if (verificar==true) {
            System.out.println("A posição no vetor é: "+ auxiliar);
       }else{
            System.out.println("não encontrado ");
       }

       Livros nomeDoVento2 = new Livros("O nome do Vento", 60, 01, "Patrick Rothfuss");
       Pon[5] = nomeDoVento2;
       Livros nomeDoVento3 = new Livros("O nome do Vento", 60, 06, "Patrick Rothfuss");
       Pon[6] = nomeDoVento3;

       System.out.println("Digite o codigo de barras do produto");
       for(int i = 0 ;i < Pon.length; i++ ){
        System.out.println(Pon[i].toString());
       }
       resposta = sc.nextInt();
       sc.close();
       auxiliar = 0;
       verificar = false;
       for(int i = 0 ;i < Pon.length; i++ ){
            if(Pon[i].getCodigoBarras()==resposta){
                verificar=true;
                auxiliar = i;
            };
       };
       if (verificar==true) {
            System.out.println("A posição no vetor é: "+ auxiliar);
       }else{
            System.out.println("não encontrado ");
       }
    }
}
