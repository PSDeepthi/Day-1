// call by ref using arrays and ouput changes

public class examp2 {
    public static void main(String[] args) {
        int[] array = {1,2,3};

        System.out.print("Before : ");
        for (int value : array) {
            System.out.print(value + " ");
        }

        modifyArray(array);

        System.out.print("\nAfter : ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }
}

