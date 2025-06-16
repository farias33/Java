/*
 * Criar metodo construtor: toda vez que uma conta for criada seu saldo será definido como zero e status definido como false(ou seja, a conta esta fechada ainda)
 * Quem tem conta corrente(CC) recebe automaticamente 50 reais, e quem tem conta poupanca(CP) recebe 150 reais
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
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
        System.out.println("Status: " + this.isStatus());
    }


    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void abrirConta(String tipo){
        this.setStatus(true);
        this.setTipo(tipo);
        if(this.getTipo() == "CC"){
            this.setSaldo(50);
        } else if (this.getTipo() == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Saldo em crédito, nao eh possivel fechar a conta");
        } else if (this.getSaldo() < 0){
            System.out.println("Saldo em débito, nao eh possivel fechar a conta");
        }else System.out.println("Conta fechada com sucesso");
    }


    public void depositar(int v){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
        }
    }


    public void sacar(int v){
        if(this.isStatus() && this.getSaldo() > v){
            this.setSaldo(this.getSaldo() - v);
        }else System.out.println("Não foi possivel sacar");
    }


    public void pagarMensal(){
        if(this.isStatus()){
            if(this.getTipo() == "CC"){
                this.setSaldo(this.getSaldo() - 12);
            } else if (this.getTipo() == "CP"){
                this.setSaldo(this.getSaldo() - 20);
            }else System.out.println("Tipo de conta não existe");
        }else System.out.println("Saldo insuficiente para pagar mensalidade");


    }






















}
