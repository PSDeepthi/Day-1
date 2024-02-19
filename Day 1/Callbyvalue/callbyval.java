class Person {
    public static void main(String[] args) {
        String x = "asdffff";
        System.out.println("Before: " + x);

        modifyNum(x);

        System.out.println("After: " + x);
    }

    public static void modifyNum(String x) {
        x = "asdf";
    }
}

