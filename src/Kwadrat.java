public class Kwadrat {
    private int a;
    private int field;

    public Kwadrat() {
    }

    public Kwadrat(int a, int field) {
        this.a = a;
        this.field = field;
    }

    void wypisz() {
        System.out.println("-----------------");
        System.out.println(this.a);
        System.out.println(this.field);
        System.out.println("-----------------");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        this.field = a * a;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
        this.a = (int) Math.sqrt(field);
    }
}
