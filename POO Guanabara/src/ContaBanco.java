
public class ContaBanco {

    // atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // metodos personalizados

    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Impossivel fechar conta, saldo maior que zero");
        } else if (this.getSaldo() < 0){
            System.out.println("Impossivel fechar conta, saldo negativo!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada");
        }
    }

    public void depositar(float v){
        if (this.getStatus()){ // nesse caso como é um booleano não precisa colocar a condição
            // this.saldo = this.saldo + v; dessa forma está mexendo direto com os atributos
            this.setSaldo(this.getSaldo() + v); // dessa forma está usando os metodos especiais
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Imporssivel fazer o deposito, conta fechada.");
        }
    }

    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conde de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else{
            System.out.println("Impossivel sacar conta fechada!");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (getTipo().equals("CC")){
            v = 12;
        } else if (getTipo().equals("CP")){
            v = 20;
        }
        if (this.getStatus()){
            if (this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga");
            } else{
                System.out.println("Saldo insuficiente");
            }
        } else{
            System.out.println("Impossivel pagar, conta inativa.");
        }
    }

    // Metodos construtores

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    // get and set

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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
