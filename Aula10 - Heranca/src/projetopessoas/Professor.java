package projetopessoas;

public class Professor extends Pessoas{

    private String especialidade;
    private float salario;

    public void receberAumento(float aument){
        this.setSalario(getSalario() + aument);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
