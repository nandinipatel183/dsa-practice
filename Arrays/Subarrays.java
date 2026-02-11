public class Subarrays {

    public static void printSubarrays(int marks[]) {

        for (int i = 0; i < marks.length; i++) {
            int start = i;

            for (int j = i; j < marks.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(marks[k] + " ");
                }
                System.out.println(); // new line after each subarray
            }
        }
    }

    public static void main(String[] args) {
        int marks[] = {2, 4, 6, 8, 10};
        printSubarrays(marks);
    }
}
