import java.util.Arrays;

public class SortableArray {
    public static int[] sortIntegers(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static String[] sortStrings(String[] array) {
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        int[] intArray = {3, 5, 1, 4, 2};
        String[] stringArray = {"banana", "apple", "cherry", "date"};

        //Display sorted integer array
        System.out.println("Sorted Integers: " + Arrays.toString(sortIntegers(intArray)));
        System.out.println("Sorted Strings: " + Arrays.toString(sortStrings(stringArray)));
    }
}
