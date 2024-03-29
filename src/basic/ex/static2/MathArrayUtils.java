package basic.ex.static2;

public class MathArrayUtils {

    private MathArrayUtils(){ }

    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int minValue = array[0];
        for (int num : array) {
            if (minValue > num) {
                minValue = num;
            }
        }
        return minValue;
    }

    public static int max(int[] array) {
        int maxValue = array[0];
        for (int num : array) {
            if (maxValue < num) {
                maxValue = num;
            }
        }
        return maxValue;
    }
}
