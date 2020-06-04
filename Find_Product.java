import java.util.*;
class TestClass {
    public static void main(String args[] ) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] Array = new long[N];
        long Result = 1;
        double Module = Math.pow(10,9)+7;

        for(int i=0; i<N; i++){
            Array[i] = scan.nextLong();
        
            Result = (Result*Array[i]) % Module;
        }

        System.out.println(+Result);

    }
}
