public class SwapNumber {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.println("x: " + x + " y:" + y);

        x = x * y;
        y = x / y;
        x = x / y;


        System.out.println("x: " + x + " y:" + y);

    }
}
