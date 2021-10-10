package Aula12;

public class main {

    public static void main(String[] args) {

        // Animal n = new Animal(); não pode ser instanciado pois é uma classe abstrata.

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        a.locomover();
        p.alimentar();

        Canguru c = new Canguru();

        c.locomover();

    }
}
