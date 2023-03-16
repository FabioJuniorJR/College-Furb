public class PC {
    private char letraPC = 'O';
    private Mapa mapa;

    public PC(Mapa mapa) {
        this.mapa = mapa;
    }

    public boolean jogar() {
        int l;
        int c;
        do {
            l = mapa.sortear(0, 3);
            c = mapa.sortear(0, 3);
        } while (!mapa.jogar(l, c, letraPC));

        System.out.println("PC[" + l + "][" + c + "]");

        if (mapa.verificarGanhador(letraPC)) {
            System.out.println(" ... PC GANHOU!\n");
            return true;
        } else {
            return false;
        }
    }
}