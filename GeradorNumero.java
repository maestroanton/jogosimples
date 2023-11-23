    import java.util.Random;

    public class GeradorNumero {
        private Random random;

        public GeradorNumero() {
            this.random = new Random();
        }

        public int nextInt(int limite) {
            return random.nextInt(limite);
        }
    }