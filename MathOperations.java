import java.util.Scanner;
public class MathOperations {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, result, res2, res3, res4, res5;
        System.out.println("Enter first num: ");
        first = num.nextInt();
        System.out.println("Enter second num: ");
        second = num.nextInt();
        result = first + second;
        System.out.println("Result+ is - " + result);
        res2 = first - second;
        System.out.println("Result- is - " + res2);
        res3 = first * second;
        System.out.println("Result* is - " + res3);
        res4 = first / second;
        System.out.println("Result/ is - " + res4);
        res5 = first %second;
        System.out.println("Result% is - " + res5);
        result++;
        System.out.println(result);
        res2--;
        System.out.println(res2);

    }
}
