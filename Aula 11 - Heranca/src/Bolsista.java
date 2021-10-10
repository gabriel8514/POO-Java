public class Bolsista extends Aluno{

    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando a bolsa de " + this.getNome());
    }

    @Override //sobrepoe o metodo de pegar mensalidade criado na classe aluno.
    public void pagarMensalidade() {
        System.out.println(this.getNome() + "É bolsista, tem desconto");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
