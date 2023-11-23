public class Main {
    public static void main(String[] args) {
        GeradorNumero geradorNumero = new GeradorNumero();
        Dado dado = new Dado(geradorNumero);

        Jogador jogador = new Jogador(132, "Roberto");
        Jogo jogo = new Jogo(jogador);

        JogoMestre jogoMestre = new JogoMestre(jogador, jogo);
        jogoMestre.jogar(10);
    }
}