public class Main {
    public static void main(String[] args) {
        int[] num = new int[] {5};
        System.out.println("Before: " + num[0]);

        modifyNum(num);

        System.out.println("After: " + num[0]);
    }

    public static void modifyNum(int[] x) {
        x[0] = 10;
    }
}

