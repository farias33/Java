
public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        Bolsista b1 = new Bolsista();
        Aluno a1 = new Aluno();
        Professor p3 = new Professor();
        Funcionario f1 = new Funcionario();

        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");

        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setSexo("M");
        a1.pagarMensalidade();

        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();




        System.out.println(v1.toString());
        System.out.println(b1.toString());


    }
}