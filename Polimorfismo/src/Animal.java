public abstract class Animal {
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMembros() {
        return membros;
    }

    public void setMembros(String membros) {
        this.membros = membros;
    }

    protected double peso;
    protected int idade;
    protected String membros;

    //Métodos abstratos, apenas na classe raiz, eu acho
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
