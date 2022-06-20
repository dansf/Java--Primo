public class Primo {
    private int numeroPrimo;

    Primo(int numeroPrimo) {
        this.numeroPrimo = numeroPrimo;
    }

    public int getNumeroPrimo() {
        return numeroPrimo;
    }

    public void setNumeroPrimo(int numeroPrimo) {
        this.numeroPrimo = numeroPrimo;
    }

    public boolean verificarPrimo(int numero) {
        for (int i = 0; i <= (numero + 30); i++) {

            if (i % 2 == 0) {
                continue;
            }
            if (i % 3 == 0) {
                continue;
            }
            if (i % 5 == 0) {
                continue;
            }
            if (i % 7 == 0) {
                continue;
            }
            if (numero == i) {
                return true;
            }
        }
        return false;
    }

    public String informarPrimo(boolean verificarPrimo) {
        return verificarPrimo ? "E primo" : "Nao e primo";
    }
}
