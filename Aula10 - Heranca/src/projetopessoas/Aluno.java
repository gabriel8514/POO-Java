package projetopessoas;

public class Aluno extends Pessoas{

    private int mat;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("Matricula será cancelada");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
