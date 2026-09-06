package Arrays;

// count frequency of each element into an array
import java.util.HashMap;
import java.util.Map;

public class frequency_each {

    public static void frequency(int[] arr, int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        // storing key and value into hashmap
        for (int i = 0; i < arr.length; i++) {
            // key is array number and value is frequency of that number
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 6, 3, 4, 2 };
        frequency(arr, arr.length);
    }
}