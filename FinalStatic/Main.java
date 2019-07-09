package FinalStatic;

public class Main {
    public static void main(String[] args) {

        final int z = 10;
        System.out.println(z);
        //z = 24;
        //System.out.println(z);

        int x = Math.mult(12, 23);
        System.out.println(x);
        Math a = new Math();
        System.out.println(a.x);
        a.x = 24;
        System.out.println(a.x);
        Math b = new Math();
        System.out.println(b.x);
    }
}
