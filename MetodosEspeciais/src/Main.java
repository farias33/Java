public class Main { //Dentro da classe Main, eu tenho um metodo principal chamado main, que está a utilizar o objeto c1 que é uma caneta
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);

        Caneta c2 = new Caneta("KKK", "Laranja", 1.5f);
        //c1.modelo = "BIC cristal";
        //c1.setModelo("BIC cristal");

        //c1.setPonta(0.5f);
        //c1.ponta = 0.f; isso aqui não pode, pois eu tenho acesso privado na ponta, logo não consigo mexer diretamente no tributo

        //Aqui eu não tive acesso diretamente ao atributo, mas sim passei pelos metodos acessores para chegar até eles
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

        c1.status();
    }
}