import java.util.*;
//Find Leader in an array 
//An element is a leader if it is greater than all the elements to its right side.
    

public class Q15LeadersInArr {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeaders(arr);
    }
    static void findLeaders(int[] arr){
        ArrayList<Integer> li = new ArrayList<>();
        int rightMax=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>rightMax){
                li.add(arr[i]);
                rightMax=arr[i];
            }
        }
        Collections.reverse(li);
        System.out.println("Leaders in the array are: " + li);
    }
}
