import java.util.Arrays;

public class paramtest {
    public static void main(String[] args) {
        // ARRAY
        int[] arr = {1, 2, 3, 4};
        testingArr(arr);
        
        // String
        String str = "ZOHO";
        testingStr(str);
        
        // String arr
        String[] arrStr = {"ONE","TWO","THREE"};
        testingStrArr(arrStr);
    }

    public static void testingArr(int[] arr) {
        arr[1] = 10;
        System.out.println(Arrays.toString(arr)); // array is mutable
    }

    public static void testingStr(String str) {
        str.charAt(2) = 'E'; //-> cannot be assigned
        System.out.println(str);// String is immutable
    }

    public static void testingStrArr(String[] arr) {
        arr[1] = "TEN";
        System.out.println(Arrays.toString(arr));// array is mutable
    }
}

