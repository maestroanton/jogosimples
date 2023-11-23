public class Jogador {
    private int dinheiro;
    private String nome;

    public Jogador(int dinheiro, String nome) {
        this.dinheiro = dinheiro;
        this.nome = nome;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarBalanco(int dinheiro) {
        this.dinheiro += dinheiro;
    }

    public void removerBalanco(int dinheiro) {
        this.dinheiro -= dinheiro;
    }

    public boolean checagemBalanco(int dinheiro) {
        return (this.dinheiro >= dinheiro);
    }
}