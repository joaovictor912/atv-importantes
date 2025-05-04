public class Atribuicao {
    private Professor professor;
    private Disciplina disciplina;
    
    public Atribuicao(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
    }
    
    public Professor getProfessor() {
        return professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
 
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    public String getDados() {
        return "Professor: " + professor.getDados() + "\nDisciplina: " + disciplina.getDados();
    }
}