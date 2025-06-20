public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudaTrabalho(){
        this.trabalhando = !this.trabalhando; //Vai inverter a situacao atual de trabalhando
    }
}
