/**
 * Einer erklärt dem anderen den Code und versucht herauszufinden, was der Code macht.
 */
public class QuietscheEnteUebung {

    public static void main(String[] args) {
        System.out.println(getSomething(6));

        System.out.println(doSomething2(new int[]{22,12,13,17}, 17));
    }

    public static int getSomething(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int first = 0;
        int second = 1;
        int nth = 1;

        for (int i = 2; i <= n; i++) {
            nth = first + second;
            first = second;
            second = nth;
        }
        return nth;
    }

    public static int doSomething2(int arr[], int x) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == x) {
                return middleIndex;
            }
            else if (arr[middleIndex] < x)
                firstIndex = middleIndex + 1;

            else if (arr[middleIndex] > x)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }
}
