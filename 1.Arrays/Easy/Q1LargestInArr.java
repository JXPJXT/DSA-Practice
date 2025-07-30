public class Q1LargestInArr{
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int largest = findLargest(arr);
        System.out.println("The largest element in the array is: " + largest);
    }
    static int findLargest(int[] arr){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
}