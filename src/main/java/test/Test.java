package test;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        for (int i = 0; i < 20; i++) {
            System.out.println("i = " + i);
            Thread.sleep(2000);
        }
    }
}
