package Aula13;

public class Main {

    public static void main(String[] args) {

        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        l.emitirSom();
        c.emitirSom();

        c.reagir(true);
        c.reagir(2,12.5f);
        c.reagir(17,4.6f);
    }
}
