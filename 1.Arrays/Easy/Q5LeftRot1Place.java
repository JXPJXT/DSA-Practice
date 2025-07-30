public class Q5LeftRot1Place {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + java.util.Arrays.toString(arr));

        leftRotate(arr);
        
        System.out.println("Array after left rotation by one place: " + java.util.Arrays.toString(arr));
    }
    static void leftRotate(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
    }
}
