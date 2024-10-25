public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno("Alberto",62,1.75,19,01);
        Aluno a2 = new Aluno("Jorge",70,1.65,20,02);
        

        Professor p1 = new Professor("Gabriel",67,1.77,18,true);
        Professor p2 = new Professor("Cadu",90,1.99,18,true);
        

        Pessoa[] pessoas = new Pessoa[4];

        pessoas[0] = a1;
        pessoas[1] = a2;
        pessoas[2] = p1;
        pessoas[3] = p2;

        for (Pessoa iPessoa : pessoas) {
            System.out.println(iPessoa.toString());
        }

    }
}
