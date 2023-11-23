public class JogoMestre {
    private Jogador jogador;
    private Jogo jogo;

    public JogoMestre(Jogador jogador, Jogo jogo) {
        this.jogador = jogador;
        this.jogo = jogo;
    }

    public void jogar(int rodadas) {
        System.out.println(jogador.getNome() + " começa a jogar.");
        for(int rodada = 1; rodada <= rodadas; rodada++) {
            System.out.println("Rodada: " + rodada);
            jogo.rodada(5);
            System.out.println("Balanço de " + jogador.getNome() + ": " + jogador.getDinheiro() + "R$.");
        }
        System.out.println("Fim de jogo, o balanço final é de " + jogador.getDinheiro() + "R$.");
    }
}

