import static java.lang.System.exit;

public class Jogo {
    private Jogador jogador;
    private GeradorNumero geradorNumero = new GeradorNumero();
    private Dado dado;


    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        this.dado = new Dado(geradorNumero);
    }

    public void rodada(int dinheiro) {
        if(jogador.checagemBalanco(dinheiro)) {
            int total = dado.jogar() + dado.jogar();
            System.out.println(jogador.getNome() + " tirou " + total + ".");
            if(total == 8) {
                int adicionar = dinheiro * 2;
                jogador.adicionarBalanco(adicionar);
                System.out.println("Você ganhou: " + adicionar + "R$.");
            } else {
                jogador.removerBalanco(dinheiro);
                System.out.println("Você perdeu " + dinheiro + "R$.");
            }
        } else {
            System.out.println("Acabou o dinheiro, não tem dinheiro.");
            exit(0);
        }
    }
}
