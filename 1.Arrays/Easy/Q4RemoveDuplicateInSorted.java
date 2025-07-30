import java.util.Arrays;

public class Q4RemoveDuplicateInSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));

        int newLength = removeDuplicates(arr);
        
        System.out.print("Array after removing duplicates (logical view): [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("New length of unique elements: " + newLength);
    }

    static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }
}