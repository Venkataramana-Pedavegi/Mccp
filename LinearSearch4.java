import java.util.Scanner;

public class LinearSearch4 {
    static boolean search(int[] a, int index, int key) {
        if (index == a.length) {
            return false;
        }
        if (a[index] == key) {
            return true;
        }
        return search(a, index + 1, key);
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

        boolean result = search(a, 0, key);

        if (result) {
            System.out.println("Element exists in the array");
        } else {
            System.out.println("Element does not exist in the array");
        }

        sc.close();
}
}
