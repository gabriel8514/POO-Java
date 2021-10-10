package UltraEmojiCombat;

public class UltraEmojiCompat {

    public static void main(String[] args) {

        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França",31, 1.75f, 68.9f,
                11,2,1);

        l[1] = new Lutador("Putscript", "Brasil", 29,1.68f, 57.8f,
                142,2,3);

        l[2] = new Lutador("Gabriel Reis", "Brasileiro", 24, 1.88f, 95.2f,
                100,0,0);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0],l[1]);
        UEC01.lutar();
    }
}
