import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner scan = new Scanner(System.in);
       int s = scan.nextInt();
       long Factorial = 1;
        for(int i=1; i<=s; ++i){
            Factorial *= i;
        }
            System.out.println(+Factorial);

    }
}
