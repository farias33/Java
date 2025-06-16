import javax.swing.JFrame;

//Vamos exemplificar a construção de uma janela JFrame para uma GUI
public class Main {
    public static void main(String[] args) {
        //cria uma janela com título
        JFrame myFrame  = new JFrame("Janela vazia"); //titulo da janela

        //programa é finalizado quando a janela é fechada
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //define o tamanho em pixels da janela
        myFrame.setSize(960, 540);

        //a janela é exibida na tela
        myFrame.setVisible(true);

    }
}