import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first;
        int second = 50;
        boolean isTrue = true;
        System.out.println("Enter first number");
        first = num.nextInt();

        isTrue = first == 51 ? true : false;

        if (first >= second && isTrue) { //True
            System.out.println("Your number is 50");
            System.out.println("\n");
        } else if (first == 45)
            System.out.println("Num is equal 45");
        else {
            System.out.println("Hi");
        }

        switch (first) {
            case 51:
                System.out.println("Your number is 51");
                break;
            case 48:
                System.out.println("Your number is 48");
                break;
            case 57:
                System.out.println("Your number is 57");
                break;
                default:
                    System.out.println("Num is equal something");
        }

    }
}