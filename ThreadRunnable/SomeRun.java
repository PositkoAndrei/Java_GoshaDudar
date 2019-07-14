package ThreadRunnable;

    class Inter implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("Number - " + i);
    }
}
    public class SomeRun {
        public static void main(String[] args) {
            Thread new_one = new Thread(new Inter());
            Thread new_two = new Thread(new Inter());

            new_one.start();
            new_two.start();

        }
    }


