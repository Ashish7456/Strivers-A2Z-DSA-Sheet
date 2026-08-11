package Arrays;
// array that contains only 1 and 0 return the count of maximum consecutive ones in the array..
// https://leetcode.com/problems/max-consecutive-ones/description/
public class consecutive_one {
    static int findconsecutive(int[] arr ){
        int count = 0;
        int max = 0;
        int i =0;

        while (i<arr.length) {
            if (arr[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
                i++;
            }else{
                count = 0;
                i++;
            }
        }
        return max;
        
    }
    public static void main(String[] args) {
        int[] arr = { 1,1,1,1,1,1,0,1};
        System.out.println(findconsecutive(arr));
    }
}
