public class Q9MaxAndMinInArrSingleTraversal {
 public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 9};
    int[] result = findMaxAndMin(arr);
    System.out.println("The largest element in the array is: " + result[0]);
    System.out.println("The smallest element in the array is: " + result[1]);
 }   
 static int[] findMaxAndMin(int[] arr){
     int max=Integer.MIN_VALUE;
     int min=Integer.MAX_VALUE;
     for(int i=0;i<arr.length;i++){
         if(arr[i]<min){
             min=arr[i];
         }
         if(arr[i]>max){
             max=arr[i];
         }
     }
     return new int[]{max,min};
 }
}
