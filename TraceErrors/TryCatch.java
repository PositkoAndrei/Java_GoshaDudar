package TraceErrors;

public class TryCatch {
    public static void main(String[] args) {
        int arr[] = {23, 6, 7};

        try {
            //int x = 100 / 0;
            System.out.println(arr[3]);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Finally is working!");
        }
    }
}
