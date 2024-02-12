public class wrapperclass {
    public static void main(String[] args) {
        float floatValue = 14.34f;
        Integer integerValue = Float.valueOf(floatValue).intValue();
        System.out.println("Integer Conversion: " + integerValue);
        Double doubleValue = Float.valueOf(floatValue).doubleValue();
        System.out.println("Double Conversion: " + doubleValue);
    }
}

