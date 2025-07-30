import java.util.*;

public class Q13UnionOfTwoSorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 3, 5, 6, 8};
        int[] union = findUnion(arr1, arr2);
        
        System.out.print("Union of the two sorted arrays: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }

    static int[] findUnion(int[] arr1, int[] arr2){
        List<Integer> li = new ArrayList<>();
        int a = 0;
        int b = 0;

        while (a < arr1.length && b < arr2.length) {
            if (arr1[a] < arr2[b]) {
                if (li.isEmpty() || li.get(li.size() - 1) != arr1[a]) {
                    li.add(arr1[a]);
                }
                a++;
            } else if (arr2[b] < arr1[a]) {
                if (li.isEmpty() || li.get(li.size() - 1) != arr2[b]) {
                    li.add(arr2[b]);
                }
                b++;
            } else {
                if (li.isEmpty() || li.get(li.size() - 1) != arr1[a]) {
                    li.add(arr1[a]);
                }
                a++;
                b++;
            }
        }

        while (a < arr1.length) {
            if (li.isEmpty() || li.get(li.size() - 1) != arr1[a]) {
                li.add(arr1[a]);
            }
            a++;
        }

        while (b < arr2.length) {
            if (li.isEmpty() || li.get(li.size() - 1) != arr2[b]) {
                li.add(arr2[b]);
            }
            b++;
        }
        
        int[] union = new int[li.size()];
        for (int m = 0; m < li.size(); m++) {
            union[m] = li.get(m); 
        }
        return union;
    }   
}