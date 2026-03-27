package binary_search;

public class celing_char {
    static char celing_charr(char[] ch, char target) {
        int start = 0;
        int end = ch.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target >= ch[mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return ch[start % ch.length];
    }
    public static void main(String[] args) {
        // int[] arr = { 2, 4, 8, 10, 12 ,14,16};
        char[] ch = { 'a', 'c', 'f', 'h', 'j' };
        System.out.println(celing_charr(ch, 'h'));
    }
}