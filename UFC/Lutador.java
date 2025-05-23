/*
* na func apresentar() teremos do lutador: nome, nacionalidade, idade, altura peso categoria (todos concatenado com seus respectivos)
*em status teremos o nome e a quantidade de vitorias derrotas e empates
* funcao de ganharLuta vai aumentar +1 na quantidade de vitorias, sendo assim para derrotas e empates
* sexos: masculino e feminino
* */
public class Lutador{
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(); //Para automatizar o reconhecimento de categoria por peso
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso <= 0 || this.peso > 120.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 56.7) {
            this.categoria = "Mosca";
        } else if (this.peso <= 61.2) {
            this.categoria = "Galo";
        } else if (this.peso <= 65.8) {
            this.categoria = "Pena";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 77.1) {
            this.categoria = "Meio-Médio";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 93.0) {
            this.categoria = "Meio-Pesado";
        } else {
            this.categoria = "Pesado";
        }
    }


    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    private String nome;
    private String sexo;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String sexo, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso); //Para que meu getCategoria() nao retorne null, preciso colocar dessa forma.
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Altura: " + this.getIdade() + " metros");
        System.out.println("Peso: " + this.getPeso() + " Kg");
        System.out.println("Categoria: " + this.getCategoria());
    }

    public void status(){
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }

}
