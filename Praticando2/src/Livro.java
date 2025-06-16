public class Livro implements Publicacao{

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPag(totPag);
        this.setLeitor(leitor);
    }


    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totPag=" + totPag +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ", leitor='" + leitor.getNome() + '\'' +
                ", leitor='" + leitor.getIdade() +
                ", leitor='" + leitor.getSexo() +
                '}';
    }

    @Override
    public void abrir() {
        this.setAberto(isAberto());
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhera(int p) {
        this.setPagAtual(p);
    }

    @Override
    public void avancarPag() {

    }

    @Override
    public void voltarPag() {

    }
}
