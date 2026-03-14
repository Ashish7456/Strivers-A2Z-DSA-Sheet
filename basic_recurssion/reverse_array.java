package basic_recurssion;

import java.util.Scanner;

public class reverse_array {
    public static void reversearr(char arr[],int left,int right) {

        if (left>=right){
            return;
        }
        char  temp;
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reversearr(arr,left+1,right-1);
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        char[] arr = {'a','s','h','i','s','h'};
        reversearr(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}