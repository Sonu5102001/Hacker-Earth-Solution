import java.util.*;
class TestClass {
    public static void main(String args[] ) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int r = s.nextInt();
        int k = s.nextInt();
        int Result = 0;

        for(int i=l; i<=r; i++){
            if(i%k==0)
            Result++;
        }

        System.out.println(Result);

    }
}
