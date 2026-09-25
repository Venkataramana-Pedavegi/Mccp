import java.util.Scanner;

public class LinearSearch8 {
    static int lastOccurrence(int[] a, int index, int key) {

        if (index == a.length) {
            return -1;
        }

        int result = lastOccurrence(a, index + 1, key);

        if (result != -1) {
            return result;
        }

        if (a[index] == key) {
            return index;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = lastOccurrence(a, 0, key);

        System.out.println("Last occurrence index: " + result);
    
}
}

