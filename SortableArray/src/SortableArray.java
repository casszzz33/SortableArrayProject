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
        int[] intArray = {9, 4, 6, 1, 3};
        String[] stringArray = {"pear", "orange", "banana", "apple"};

        
        System.out.println("Sorted Integers: " + Arrays.toString(sortIntegers(intArray)));
        System.out.println("Sorted Strings: " + Arrays.toString(sortStrings(stringArray)));
    }
}
