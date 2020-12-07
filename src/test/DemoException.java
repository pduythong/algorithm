package test;

public class DemoException {

    public static void method1() throws Exception {
        try {
            System.out.println("5");
            throw new Exception1();
        } catch (Exception e) {
            System.out.println("6");
            throw new Exception2();
        } finally {
            System.out.println("7");
            throw new Exception();
        }
    }

    public static void main(String[] args) throws Exception1 {
        try {
            System.out.println("1");;
            method1();

        } catch (Exception e) {
            System.out.println("3");
            throw new Exception2();
        }finally {
            System.out.println("4");
            throw new Exception1();
        }
    }

}
