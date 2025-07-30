public class Q2SecondLargestInArrWithoutSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest element in the array is: " + secondLargest);
    }
    static int findSecondLargest(int[] arr){
        if(arr.length<2){
            return -1;
        }
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}
