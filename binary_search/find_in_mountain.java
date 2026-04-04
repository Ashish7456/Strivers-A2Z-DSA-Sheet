package binary_search;

import mathss.prime;

class find_in_mountain {
    static int index(int[] arr, int target) {
        int peek = findpeek(arr);// peek element will store in peek
        int firsttry = orderagnostic(arr, target, 0, peek);// mid will return by orderagnostic method
        if (firsttry != -1) {//
            return firsttry;
        }
        //if elemetn is not found in ascending order then this return will execute.
        return orderagnostic(arr, target, peek, arr.length - 1);//search in descending order

    }

    // find peek element in the array
    static int findpeek(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderagnostic(int[] arr, int target, int start, int end) {
        boolean asc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (asc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5,8,10,9,7, 6, 1 };
        int[] arr = { 0, 4, 6, 5, 3, 2, 1 };
        // System.out.println(findpeek(arr));
        System.out.println(index(arr, 2));
    }
}