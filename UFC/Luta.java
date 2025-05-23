import java.util.Random;

/*

criar getters e setters para os atributos
aqui tenho que marcarLuta(aqui defino os lutadores e se estao aptos a lutar e defino o desafiante e desafiado), Lutar(aqui SE a
luta for aprovada uso o aleatorio para decidir o resultado, usar estrutura de decisao para navegar entre os resultado mais facilmente)
vou utilizar a classe random do java para definir o resultado da luta
 * Regras da luta:
 * só pode ser marcada entre lutadores da mesma categoria e sexo
 * Desafiado e desafiantes devem ser lutadores diferentes
 * Só pode acontecer se estiver aprovada
 * Só pode ter como resultado vitória de um dos lutadores
 * */
public class Luta {
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Lutador desafiado;
    public Lutador desafiante;
    public int rounds;
    public boolean aprovada;

    //Uso equals ao invés de "==", pois o java recomenda por ser uma string
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1.getSexo().equals(l2.getSexo()) && l1.getNome() != l2.getNome()){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        };
    }

    public void luta(){
        if(this.isAprovada()){
            System.out.println("-------------------------------");
            this.desafiado.apresentar();
            System.out.println("###DESAFIADO###");
            System.out.println("-------------------------------");
            this.desafiante.apresentar();
            System.out.println("###DESAFIANTE###");
            System.out.println("-------------------------------");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor){
                case 0:
                    System.out.println("[Lutador(a) " + this.desafiado.getNome() + " Venceu!]");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 1:
                    System.out.println("[Lutador(a) " + this.desafiante.getNome() + " Venceu!]");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;

                case 2:
                    System.out.println("[Lutador(a) " + this.desafiado.getNome() + " Venceu!]");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
            }
        }else System.out.println("Luta nao aprovada!");
    }
}
























