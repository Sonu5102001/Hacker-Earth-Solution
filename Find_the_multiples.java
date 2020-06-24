import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] Arr = new long[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            Arr[i] = scan.nextLong();
        }

        for (int i = 0; i < N; i++) {
            if (Arr[i] % 3 == 0) {
                count++;
            }
        }

        System.out.println(count);

    }
}
