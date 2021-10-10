package aula06;

public class ControleRemoto implements Controlador {

    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

   //metodos especiais

    public ControleRemoto(int volume) {
        this.volume = volume;
        this.ligado= false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //metod os abstratos

    @Override // Override signica sobre escrever.
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----MENU-----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("\n");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechamendo Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado() && this.getVolume() >0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && getTocando()){
            this.setTocando(false);
        }
    }

}
