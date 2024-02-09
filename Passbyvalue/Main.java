public class Main {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before: " + num);

        modifyNum(num);

        System.out.println("After: " + num);
    }

    public static void modifyNum(int x) {
        x = 10;
    }
}

