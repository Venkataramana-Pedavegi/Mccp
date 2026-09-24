import java.util.Scanner;

public class LinearSearch6 {
    static int firstOccurrence(int[] a, int index, int key) {

        if (index == a.length) {
            return -1;
        }

        if (a[index] == key) {
            return index;
        }

        return firstOccurrence(a, index + 1, key);
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

        int result = firstOccurrence(a, 0, key);

        System.out.println("First occurrence index: " + result);
        sc.close();
    }
}

    

