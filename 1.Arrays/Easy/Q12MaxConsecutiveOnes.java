public class Q12MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int maxCount = findMaxConsecutiveOnes(arr);
        System.out.println("Maximum consecutive ones: " + maxCount);
    }
    static int findMaxConsecutiveOnes(int[] arr){
        int maxC=0;
        int tempC=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                tempC++;
                maxC=Math.max(maxC,tempC);
            }
            else{
                tempC=0;
            }
        }
        return maxC;
    }
}
