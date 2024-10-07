public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4, 1};

        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
