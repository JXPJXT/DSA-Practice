public class Q6LeftRotateDPlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2; // Number of places to rotate
        System.out.println("Original array: " + java.util.Arrays.toString(arr));

        leftRotate(arr, d);
        
        System.out.println("Array after left rotation by " + d + " places: " + java.util.Arrays.toString(arr));
    }   
    static void leftRotate(int[] arr,int d){
        int[] ans=new int[arr.length];
        int k=arr.length-1;
        int c=0;
        int m=0;
        for(int i=0;i<d;i++){
            ans[i]=arr[k];
            k--;
            c++;
        }
        for(int j=c;j<ans.length;j++){
            ans[j]=arr[m];
            m++;
        }
        for(int n=0;n<arr.length;n++){
            arr[n]=ans[n];
        }
    }
    
}
