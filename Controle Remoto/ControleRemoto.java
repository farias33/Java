public class ControleRemoto implements Controlador{
    //Métodos especiais
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;


    //Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()){
            System.out.println("-------------MENU---------------");
            System.out.println("Esta ligado? " + this.isLigado());
            System.out.println("Esta tocando? " + this.isTocando());
            System.out.print("Esta volume: " + this.getVolume());

            for (int i = 0; i <= this.getVolume(); i += 10){
                System.out.print("|");
            }
            System.out.println("");
        }else System.out.println("TV desligada");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossivel dominuir volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossivel dominuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())){
            this.setTocando(true);

        }else System.out.println("Nao consegui reproduzir");
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }else System.out.println("Nao consegui pausar");
    }
}
