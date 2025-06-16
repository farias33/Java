
public class Main {
    //metodo1 realiza a captura da exceção verificada Exception
    public static void metodo1(){
        try{
            metodo2();
        } catch (Exception e){
            System.err.println("Exceção capturada: " + e);
        }
    }

    public static void metodo2() throws Exception{
        metodo3();
    }

    public static void metodo3()throws Exception{
        throw new Exception();
    }
    public static void main(String[] args) {
        metodo1();
    }
}