public class Cycles {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int j = 0;
        while (j < 20) {
            System.out.println(j);
            j+=2;
        }
        boolean isTrue = true;
        int b = 0;
        while (isTrue) {
            System.out.println(b);
            b += 2;
            if (b > 10)
                isTrue = false;
        }

        int x = 0;
        do {
            x++;
            System.out.println(x);
        } while (x < 0);
        }
    }

