public class TesteAtribuicao {
    public static void main(String[] args) {
        
        Professor professor = new Professor("zzzz", 45);

        Disciplina disciplina = new Disciplina("matematica", true);

        Atribuicao atribuicao = new Atribuicao(professor, disciplina); 


        System.out.println("atribuição:");
        System.out.println(atribuicao.getDados());
    }
}