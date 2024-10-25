public class App {
    public static void main(String[] args) throws Exception {
       /*Agora, escreva um programa em Java para demonstrar o uso dessas classes.
        Crie um array que pode conter tanto gerentes quanto desenvolvedores.
        Itere sobre o array e chame o método calcularBonusAnual para cada funcionário,
        exibindo o bônus anual. Além disso, utilize o método imprimirDetalhes
        para exibir as informações específicas de cada tipo de funcionário, incluindo nome, idade,
        salário e, no caso dos desenvolvedores, a linguagem de programação preferida. */

        Funcionario[] Fun = new Funcionario[4];

        Gerente Isaac = new Gerente("Isaac", 37, 7000, 2);
        Desenvolvedor Alberto = new Desenvolvedor("Alberto", 19, 3000, "Java");
        Desenvolvedor Gabriel = new Desenvolvedor("Gabriel", 18, 3500, "C");
        Desenvolvedor Vicenzo = new Desenvolvedor("Vicenzo", 14, 10000, "Python");

        Fun[0] = Isaac;
        Fun[1] = Gabriel;
        Fun[2] = Alberto;
        Fun[3] = Vicenzo;

        for (Funcionario Ifuncionario : Fun) {
            Ifuncionario.calcularBonusAnual();
            System.out.println("O bonus anual do "+Ifuncionario.getNome()+" é "+Ifuncionario.getBonusAnual());
        }

        for (Funcionario Ifuncionario : Fun) {
            System.out.println(Ifuncionario.toString());
        }
    }
}
