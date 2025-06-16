public class Gafanhoto extends Pessoa{
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm(){
        this.setTotAssistido(getTotAssistido() + 1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + //Aqui eu chamo o toString() da super classe para aparecer junto desse
                "\nlogin='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }

    @Override
    protected void ganharExp() {

    }

}
