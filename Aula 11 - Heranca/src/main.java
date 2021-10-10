public class main {

    public static void main(String[] args) {

        Visitante v1 = new Visitante();
        v1.setIdade(28);
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("Jubilesco");
        b1.pagarMensalidade();
        System.out.println(b1.toString());

    }
}
