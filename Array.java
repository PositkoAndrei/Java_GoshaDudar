import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] name;
        name = new int[5];
        name[0] = 23;
        name[1] = 8;
        name[2] = 87;
        name[3] = 14;
        name[4] = 95;

        System.out.println(name[4]);

    int[] array;
    int n;
    Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers of array: ");
        n = in.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter [" + i + "] index of array = ");
            array[i] = in.nextInt();
            System.out.println(array[2]);
        }

    }
}
