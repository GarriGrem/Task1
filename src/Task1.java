public class Task1 {

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static double triArea(int a, int b) {
        return 0.5 * a * b;
    }

    public static int animals(int chickens, int cows, int pigs) {
        return chickens * 2 + cows * 4 + pigs * 4;
    }

    public static boolean profitableGamble(double prob, double prize, double pay) {
        if (prob * prize > pay)
            return true;
        else
            return false;
    }

    public static String operation (int N, int a, int b) {
        if (a + b == N)
            return "added";
        else if (a - b == N)
            return "subtracted";
        else if (a / b == N)
            return "divided";
        else if (a * b == N)
            return "multiplied";
        else
            return "none";
    }

    public static int ctoa (char c) {
        return (int) c;
    }

    public static int addUpTo (int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int sum = 0;
        for (int k : arr)
            sum += k;
        return sum;
    }

    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }

    public static int sumOfCubes(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * arr[i] * arr[i];
        }
        return sum;
    }

    public static boolean abcmath (int a, int b, int c) {
        for (int i = 1; i <= b; i++) {
            a += a;
        }
        if (a % c == 0)
            return true;
        else
            return false;
    }
}
