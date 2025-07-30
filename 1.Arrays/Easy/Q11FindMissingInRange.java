public class Q11FindMissingInRange{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int start = 1;
        int end = 6;
        int missingNumber = findMissingInRange(arr, start, end);
        System.out.println("The missing number in the range is: " + missingNumber);
    }
    static int findMissingInRange(int arr[],int start,int end){
        int n=start;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                n++;
            }
            else{
                return n;
            }
        }
        return -1;
    }
}