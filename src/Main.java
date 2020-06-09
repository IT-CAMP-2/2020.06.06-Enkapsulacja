public class Main {
    public static void main(String[] args) {
        Kwadrat k = new Kwadrat(4, 16);
        k.wypisz();

        k.setA(5);


        k.wypisz();

        k.setField(36);

        k.wypisz();

        System.out.println("Bok mojego kwadratu to: " + k.getA());
    }
}
