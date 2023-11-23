public class Dado {
    private GeradorNumero geradorNumero;

    public Dado(GeradorNumero geradorNumero) {
        this.geradorNumero = geradorNumero;
    }

    public int jogar() {
        return geradorNumero.nextInt(6) + 1;
    }
}
