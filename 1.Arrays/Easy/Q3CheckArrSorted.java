public class Q3CheckArrSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};
        boolean isSorted = checkIfSorted(arr);
        System.out.println("Is the array sorted? " + isSorted);
    }
    static boolean checkIfSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
