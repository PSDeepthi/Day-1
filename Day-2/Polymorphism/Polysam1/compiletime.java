public class compiletime {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        compiletime example = new compiletime();
        System.out.println("Sum of two numbers: " + example.add(10, 20));
        System.out.println("Sum of three numbers: " + example.add(10, 20, 30));
    }
}

