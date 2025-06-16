public class Aluno extends Pessoa{
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    private int matricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno " + this.nome);
    }

    public void cancelarMatricula(){
        System.out.println("Matricula será cancelada");
    }
}
