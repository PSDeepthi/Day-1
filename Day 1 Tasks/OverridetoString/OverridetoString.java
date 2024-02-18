//implicitly inherits from the Object class. The Object class is the root class for all Java classes.

 class OverridetoString {
    private int number;
    private String name;

    public OverridetoString(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String toString() {
        return "A [number=" + number + ", name=" + name + "]";
    }

    public static void main(String[] args) {
        A obj = new A(42, "Example");
       
        System.out.println(obj);
    }
}

