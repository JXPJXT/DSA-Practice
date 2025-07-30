public class Q7MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 5};
        System.out.println("Original array: " + java.util.Arrays.toString(arr));    
        moveZeroesToEnd(arr);
        System.out.println("Array after moving zeroes to the end: " + java.util.Arrays.toString(arr));
    }
    static void moveZeroesToEnd(int arr[]){
        int[] nums = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                nums[j]=arr[i];
                j++;
            }
        }
        for(int k=j;k<arr.length;k++){
            nums[k]=0;
        }
     for(int n=0;n<arr.length;n++){
         arr[n]=nums[n];
     }  
    }
}
