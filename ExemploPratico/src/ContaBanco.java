/*
* Criar metodo construtor: toda vez que uma conta for criada seu saldo será definido como zero e status definido como false(ou seja, a conta esta fechada ainda)
* Quem tem conta corrente(CC) recebe automaticamente 50 reais, e quen tem conta poupanca(CP) recebe 150 reais
* Para uma conta ser fechada ela tem que estar vazia, ou seja, sem dinheiro
* Para depositar dinheiro na conta deve se verificar se a conta esta aberta
* Para sacar dinheiro a conta deve respeitar dois estados, ativa e ativa e com dinheiro
* No metodo de pagar mensalidade, se for uma CC ele paga 12 reais mensais e se for CP 20 reais mensais, e so pode pagar mensalidade se a conta estiver ativa
* */

public class ContaBanco {
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

//    public boolean isStatus() {
//        return status;
//    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public ContaBanco() { //Construtor
        this.setSaldo(0);
        this.status = false;
    }

    //Ao executar essa rotina, quando eu chamar o abrirConta() ele vai modificar o tipo para CC ou CP, habilitar a conta(status-> true), e adicionar o saldo dependendo do tipo de conta
    public void abrirConta(String tipo){// Foram definidas especificidades na criação de e temos que levar em consideração o tipo da conta(CC ou CP)
        this.setTipo(tipo);
        this.setStatus(true);
        if(tipo == "CC"){
            this.setSaldo(50);
        } else if (tipo == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta com débito");
        }else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float v){
        if(this.getStatus()){//this.isStatus()
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso de" + this.getDono());
        }else{
            System.out.println("é impossível depositar em uma conta fechada");
        }
    }

    public void sacar(float v){
        if(this.getStatus()){ //this.isStatus()
            if(saldo > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }

    public void pagarMensalidade(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }else {
            System.out.println("Tipo de conta nao existe");
        }

        if(this.getStatus()){ //this.isStatus()
            this.setSaldo(this.getSaldo() - v); //saldo = saldo - v
        }else{
            System.out.println("");
        }
    }
}





























