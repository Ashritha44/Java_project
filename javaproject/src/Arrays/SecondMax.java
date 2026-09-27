package Arrays;
public class SecondMin {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 2, 3};

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("Second minimum does not exist.");
        } else {
            System.out.println("Second minimum value: " + secondMin);
        }
    }
}