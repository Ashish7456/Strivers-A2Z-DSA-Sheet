package Recursion;
// checking array wheather it is sorted or not[Using Recursion]
public class check_array{

    static boolean checkarray(int[] arr,int i){
        if(i == arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && checkarray(arr, i+=1);
    } 
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println(checkarray(arr, 0));

    }
}