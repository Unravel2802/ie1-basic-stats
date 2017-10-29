public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 1, 4, 10, 6};

        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }

    public static int findMin(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
