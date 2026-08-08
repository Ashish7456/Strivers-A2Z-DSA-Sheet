package Arrays;

import java.util.ArrayList;
import java.util.List;

public class union {
    static List<Integer> findunion(int[] ar1 , int[] ar2, int n,int m){
        List<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;
        // loop will run until i became arays length
        while (i<n && j < m) {
            if (ar1[i] < ar2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1 ) != ar1[i]) {
                    union.add(ar1[i]);
                }
                i++;
            }
            // if array 2 is less than array 1
            else if (ar2[j] < ar2[i]) {
                if (union.isEmpty() || union.get(union.size() - 1 ) != ar2[j]) {
                    union.add(ar2[j]);    
                }
                j++;
            }
            // if arrays element are equal
            else{
                if (union.isEmpty() || union.get(union.size() - 1 ) != ar1[i]) {
                    union.add(ar1[i]);
                }
                //increase both iterator by one
                i++; 
                j++;
            }
        }
        // remaining unique elemnet will add into union from first array
        while (i<n) {
            if (union.isEmpty() || union.get(union.size() - 1 ) != ar1[i]){
                union.add(ar1[i]);   
            }
            i++;
        }

        // remaning unique element will add into union from secound array
        while (j<m) {
            if (union.isEmpty() || union.get(union.size() - 1 ) != ar2[j]) {
                union.add(ar2[j]);
            }
            j++;
        }
        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5 };
        List<Integer> result = findunion(arr1, arr2, arr1.length, arr2.length);
        System.out.println(result);
    }
}