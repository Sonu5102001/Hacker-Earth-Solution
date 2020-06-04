import java.util.*;
class TestClass {
    public static void main(String args[] ) {
    Scanner s = new Scanner(System.in);
    int N  = s.nextInt();
    long[] a = new long[N];
    long sum = 0;

    for(int i=0; i<N; i++){
        a[i] = s.nextLong();
        sum += a[i];
    }

    System.out.println(sum+" ");

    }
}
