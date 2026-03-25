import java.util.Scanner;

public class PalindromePerformance {

    // 1. Reverse String Method
    public static boolean reverseMethod(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    // 2. Two Pointer Method
    public static boolean twoPointerMethod(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // 3. StringBuilder Method
    public static boolean stringBuilderMethod(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter number of iterations (for accurate timing): ");
        int iterations = sc.nextInt();

        long start, end;

        // Reverse Method Timing
        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            reverseMethod(input);
        }
        end = System.nanoTime();
        long time1 = end - start;

        // Two Pointer Timing
        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            twoPointerMethod(input);
        }
        end = System.nanoTime();
        long time2 = end - start;

        // StringBuilder Timing
        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilderMethod(input);
        }
        end = System.nanoTime();
        long time3 = end - start;

        // Output Results
        System.out.println("\n--- Performance Comparison ---");
        System.out.println("Reverse Method: " + time1 + " ns");
        System.out.println("Two Pointer Method: " + time2 + " ns");
        System.out.println("StringBuilder Method: " + time3 + " ns");

        // Best Method
        long min = Math.min(time1, Math.min(time2, time3));

        if (min == time1)
            System.out.println("Fastest: Reverse Method");
        else if (min == time2)
            System.out.println("Fastest: Two Pointer Method");
        else
            System.out.println("Fastest: StringBuilder Method");

        sc.close();
    }
}