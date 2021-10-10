package UltraEmojiCombat;

import java.util.Random;

public class Luta {

    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    //metodos

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())
            && l1 != l2){
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else{
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }

    public void lutar(){
        if (this.aprovado){
            System.out.println("### DESAFIADO ###");
            this.desafiado.aprensetar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.aprensetar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            System.out.println(">>>>> RESULTADO <<<<<");
            switch (vencedor){
                case 0: //empate
                    System.out.println(" -> Empatou <-");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado venceu
                    System.out.println(" VENCEDOR -> " + this.desafiado.getNome() + " <-   ");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante venceu
                    System.out.println(" VENCEDOR -> " + this.desafiante.getNome() + " <-   ");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }

    // metodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getdesafiante() {
        return desafiante;
    }

    public void setdesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
