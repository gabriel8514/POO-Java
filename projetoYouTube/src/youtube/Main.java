package youtube;

public class Main {

    public static void main(String[] args) {

        Video v[] = new Video[2];
        v[0] = new Video("Aula 1 de POO ");
        v[1] =  new Video("Vemom");

        Gafanhoto g1 = new Gafanhoto("Tony", 22, "M", "TonyStark");
        
        Visualizacao vis = new Visualizacao(g1,v[1]);

        System.out.println(vis.toString());

//        System.out.println(g1.toString());
    }
}
