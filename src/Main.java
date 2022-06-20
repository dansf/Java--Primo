public class Main {
    public static void main(String[] args) {
        Primo primo = new Primo(49);

        System.out.println(primo.informarPrimo(primo.verificarPrimo(primo.getNumeroPrimo())));
    }
}