package projetolivro;

public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //@Override
    public String detalhes() { //metodo especial toString()
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", \nautor='" + autor + '\'' +
                ", \ntotPaginas=" + totPaginas +
                ", \npagAtual=" + pagAtual +
                ", \naberto=" + aberto +
                ", \nleitor=" + leitor.getNome() +
                ", \nidade=" + leitor.getIdade() +
                ", \nsexo=" + leitor.getSexo() +
                '}';
    }


    //contrutor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    // get and setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // extenção mentodos interface
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p > this.getTotPaginas()) {
            this.setPagAtual(getTotPaginas());
        } else{
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void volarPag() {
        this.setPagAtual(getPagAtual() - 1);
    }
}
